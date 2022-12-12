/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1;
        int amount1;
        double value1;

        int code2;
        int amount2;
        double value2;

        System.out.println("Código do primeiro produto:");
        code1 = sc.nextInt();
        System.out.println("Quantidade:");
        amount1 = sc.nextInt();
        System.out.println("Valor da unidade:");
        value1 = sc.nextDouble();

        System.out.println("Código do segundo produto:");
        code2 = sc.nextInt();
        System.out.println("Quantidade:");
        amount2 = sc.nextInt();
        System.out.println("Valor da unidade:");
        value2 = sc.nextDouble();

        double total = amount1 * value1 + amount2 * value2;

        System.out.printf("Valor a pagar = R$%.2f", total);
    }
}
