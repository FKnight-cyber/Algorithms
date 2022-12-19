/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

package Exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();
        int highest = 0;

        double[] arr = new double[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %d: ", i+1);
            arr[i] = sc.nextDouble();
        }

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[highest]) {
                highest = i;
            }
        }

        System.out.printf("\nMaior número: %.1f\n", arr[highest]);
        System.out.printf("Posição: %d\n", highest);
        sc.close();
    }
}
