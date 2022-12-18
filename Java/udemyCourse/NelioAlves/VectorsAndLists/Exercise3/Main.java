/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */

package Exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int n = sc.nextInt();

        Person[] subjects = new Person[n];
        String[] lowAgeSubjects = new String[n];
        double sumHeight = 0.0;
        double sumLowAge = 0.0;

        for(int i = 0; i < subjects.length; i++) {
            System.out.printf("Nome da pessoa %d: ", i+1);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Idade da pessoa %d: ", i+1);
            int age = sc.nextInt();
            System.out.printf("Altura da pessoa %d: ", i+1);
            double height = sc.nextDouble();
            subjects[i] = new Person(name, age, height);
            sumHeight += subjects[i].getHeight();
            if(subjects[i].getAge() < 16) {
                sumLowAge++;
                lowAgeSubjects[i] = subjects[i].getName();
            }
        }

        System.out.printf("\nAltura média: %.2f\n", sumHeight/subjects.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (sumLowAge/n)*100);
        for(int j = 0; j < sumLowAge;j++) {
            System.out.printf("%s\n", lowAgeSubjects[j]);
        }

        sc.close();
    }
}
