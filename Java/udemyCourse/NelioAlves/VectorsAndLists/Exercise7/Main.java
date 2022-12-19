/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

package Exercise7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();
        double sum = 0.0;

        double[] arr = new double[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %d: ", i+1);
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double average = sum/n;

        System.out.printf("\nMédia do vetor: %.3f\n", average);
        System.out.println("Elementos abaixo da média:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < average) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
