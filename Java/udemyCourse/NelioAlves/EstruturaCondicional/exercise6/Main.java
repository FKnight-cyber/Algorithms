/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Informe um número: ");
        int x = sc.nextInt();

        if(x < 0) {
            System.out.println("Fora de intervalo");
        }
        if(x >= 0 && x <= 25) {
            System.out.printf("Intervalo [0,25]");
        }
        if(x > 25 && x <= 50) {
            System.out.printf("Intervalo (25,50]");
        }
        if(x > 50 && x <= 75) {
            System.out.printf("Intervalo (50,75]");
        }
        if(x > 75 && x <= 100) {
            System.out.printf("Intervalo (75,100]");
        }
        if(x > 100) {
            System.out.println("Fora de intervalo");
        }
    }
}
