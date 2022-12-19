/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */

package Exercise6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = sc.nextInt();
        int highest = 0;

        double[] A = new double[n];
        double[] B = new double[n];
        double[] C = new double[n];

        System.out.println("Preencha o vetor A");
        for(int i = 0; i < A.length; i++) {
            System.out.printf("Número %d : ", i+1);
            A[i] = sc.nextDouble();
        }

        System.out.println("\nPreencha o vetor B");
        for(int i = 0; i < B.length; i++) {
            System.out.printf("Número %d : ", i+1);
            B[i] = sc.nextDouble();
        }

        System.out.println("\nVetor C");
        for(int i = 0; i < C.length; i++) {
            System.out.println(A[i] + B[i]);
        }

        sc.close();
    }
}
