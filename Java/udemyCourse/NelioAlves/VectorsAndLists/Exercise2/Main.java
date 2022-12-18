/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

package Exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        double soma = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextDouble();
            soma+=arr[i];
        }

        System.out.print("VALORES = ");

        for(int i = 0; i < arr.length; i++) {
            System.out.printf(" %.1f", arr[i]);
        }

        System.out.printf("\nSOMA = %.1f\n", soma);
        System.out.printf("MEDIA = %.1f\n", soma/arr.length);

        sc.close();
    }
}
