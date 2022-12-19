/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */

package Exercise11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int n = sc.nextInt();

        Person[] people = new Person[n];

        sc.nextLine();

        for(int i = 0; i < people.length; i++) {
            System.out.printf("Altura da pessoa %d: ", i+1);
            double heigth = sc.nextDouble();

            System.out.print("Sexo: ");
            char gender = sc.next().charAt(0);

            people[i] = new Person(heigth, gender);
        }

        double highestHeigth = people[0].getHeigth();
        double lowestHeigth = people[0].getHeigth();
        int males = 0;
        double sum = 0.0;

        for(int i = 0; i < people.length; i++) {
            if(people[i].getHeigth() > highestHeigth) {
                highestHeigth = people[i].getHeigth();
            }
            if(lowestHeigth > people[i].getHeigth()) {
                lowestHeigth = people[i].getHeigth();
            }
            if(people[i].getGender() == 'm' || people[i].getGender() == 'M') {
                males++;
            }else {
                sum += people[i].getHeigth();
            }
        }

        double averageWomenHeigth = sum/(n - males);

        System.out.printf("\nMenor altura: %.2f", lowestHeigth);
        System.out.printf("\nMaior altura: %.2f", highestHeigth);
        System.out.printf("\nMédia de altura das mulheres: %.2f", averageWomenHeigth);
        System.out.printf("\nQuantidade de homens: %d", males);

        sc.close();
    }
}
