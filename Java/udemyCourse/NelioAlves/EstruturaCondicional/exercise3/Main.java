/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: 
os números devem poder ser digitados em
ordem crescente ou decrescente
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int x = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int y = sc.nextInt();

        if (x%y == 0 || y%x == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
