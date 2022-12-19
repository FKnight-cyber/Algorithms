/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

package Exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();
        int quantity = 0;

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %d: ", i+1);
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                quantity++;
            }
        }

        System.out.printf("\nTotal de pares: %d\n", quantity);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
