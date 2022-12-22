/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00
 */

package Exercise2;

import Exercise2.Entities.Fisica;
import Exercise2.Entities.Juridica;
import Exercise2.Entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Tax payer %d# data:\n",i);
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            if(type != 'c' && type != 'i') {
                i--;
                System.out.println("Invalid type, try again!");
                continue;
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();

            sc.nextLine();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                Double healthCosts = sc.nextDouble();

                sc.nextLine();

                Pessoa pessoa = new Fisica(name, rendaAnual, healthCosts);
                pessoas.add(pessoa);
            }

            if(type == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                sc.nextLine();

                Pessoa pessoa = new Juridica(name, rendaAnual, numberOfEmployees);
                pessoas.add(pessoa);
            }
        }

        double sum = 0.0;
        System.out.println("\nTAXES PAID:");
        for(Pessoa p : pessoas) {
            sum+=p.taxCosts();
            System.out.println(p);
        }

        System.out.printf("\nTOTAL TAXES: $%.2f", sum);
        sc.close();
    }
}
