/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;

        System.out.println("Informe A:");
        A = sc.nextInt();
        System.out.println("Informe B:");
        B = sc.nextInt();
        System.out.println("Informe C:");
        C = sc.nextInt();
        System.out.println("Informe D:");
        D = sc.nextInt();

        int diferença = A*B - C*D;

        System.out.printf("DIFERENÇA = %d", diferença);
    }
}
