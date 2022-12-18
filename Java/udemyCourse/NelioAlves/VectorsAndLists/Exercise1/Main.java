/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

package Exercise1;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.printf("%d%n", arr[i]);
            }
        }
    }

}
