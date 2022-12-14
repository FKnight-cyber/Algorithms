/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto)
Em seguida, mostrar os dados do funcionário (nome e salário liquido)
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada ( somente o salário bruto é afetado
pela porcentagem) e mostrar novamente os dados do funcionário.
 */

package Exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee();

        employee.name = name;
        employee.grossSalary = grossSalary;
        employee.tax = tax;

        System.out.println(employee);

        System.out.println("Which percentage to increase salary?");
        employee.increaseSalary(sc.nextDouble());

        System.out.println(employee);

        sc.close();
    }
}
