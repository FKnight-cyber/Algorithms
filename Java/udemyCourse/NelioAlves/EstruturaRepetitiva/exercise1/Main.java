/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada 
corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta 
é o valor 2002.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int userInput;
        boolean authorization = false;

        while(!authorization) {
            System.out.print("Informe sua senha: ");
            userInput = sc.nextInt();

            if(userInput != senha) {
                System.out.println("Senha Invalida!");
            } else {
                System.out.println("Acesso Permitido");
                authorization = true;
            }
        }
    }
}
