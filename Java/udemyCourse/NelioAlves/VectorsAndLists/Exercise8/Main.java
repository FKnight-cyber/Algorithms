/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package Exercise8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();
        int evens = 0;
        double sum = 0.0;

        double[] arr = new double[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %d: ", i+1);
            arr[i] = sc.nextDouble();
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                evens++;
            }
        }

        double evensAverage = sum/evens;

        if(sum == 0.0) {
            System.out.println("\nNENHUM NUMERO PAR");
        }else {
            System.out.printf("\nMédia dos pares: %.1f\n", evensAverage);
        }

        sc.close();
    }
}
