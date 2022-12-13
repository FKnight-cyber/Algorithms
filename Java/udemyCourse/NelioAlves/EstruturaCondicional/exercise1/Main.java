/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int x = sc.nextInt();

        if (x >= 0 ) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}
