/*
Faça um programa para ler dois valores inteiros, e 
depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("Soma = %d", soma);
    }
}