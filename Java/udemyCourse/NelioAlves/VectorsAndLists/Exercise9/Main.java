/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */

package Exercise9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int n = sc.nextInt();
        int oldest = 0;

        sc.nextLine();

        String[] names = new String[n];
        int[] ages = new int[n];

        for(int i = 0; i < names.length; i++) {
            System.out.printf("Nome da pessoa %d: ", i+1);
            names[i] = sc.nextLine();
            System.out.printf("Idade da pessoa %d: ", i+1);
            ages[i] = sc.nextInt();
            sc.nextLine();
            if(ages[i] > ages[oldest]) {
                oldest = i;
            }
        }

        System.out.printf("\nO mais velho é o %s", names[oldest]);

        sc.close();
    }
}
