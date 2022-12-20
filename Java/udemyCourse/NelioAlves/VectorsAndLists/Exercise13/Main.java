/*
Faça um programa para ler um número inteiro N e depois os dados (id, nome e salário) de N funcionários.
Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X.
Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada
dos funcionários, conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
Um salário só pode ser aumentado com base em uma operação de aumento de porcentagem dada.
 */
package Exercise13;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionários: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Funcionário %d: \n",i);
            System.out.print("Id: ");
            int id = sc.nextInt();

            Employee checkEmp = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);

            if(checkEmp == null) {
                sc.nextLine();

                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Salário: ");
                double salary = sc.nextDouble();

                employees.add(new Employee(id, name, salary));
            } else {
                System.out.println("\nEste id já está cadastrado!\nInforme um id válido!\n");
                i--;
            }
        }

        System.out.println("\nFuncionários:");
        for(Employee emp : employees) {
            System.out.printf("Id: %d\n", emp.getId());
            System.out.printf("Name: %s\n", emp.getName());
            System.out.printf("Salary: %.2f\n", emp.getSalary());
        }

        System.out.print("\nInforme o id do funcionário que receberá aumento: ");
        int id = sc.nextInt();

        System.out.print("\nInforme a porcentagem do aumento: ");
        double percentage = sc.nextDouble();

        Employee empSalaryIncreased = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);

        if(empSalaryIncreased != null) {
            empSalaryIncreased.increaseSalary(percentage);
        }else {
            System.out.println("Não há nenhum funcionário registrado com este id!");
        }

        System.out.println("\nFuncionários:");
        for(Employee emp : employees) {
            System.out.printf("Id: %d\n", emp.getId());
            System.out.printf("Name: %s\n", emp.getName());
            System.out.printf("Salary: %.2f\n", emp.getSalary());
        }
    }

}
