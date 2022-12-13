/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = sc.nextInt();

        if (x%2 == 0 ) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
