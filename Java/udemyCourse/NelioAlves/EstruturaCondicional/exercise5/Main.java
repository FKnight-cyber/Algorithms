/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

Código | Produto         | Preço
1      | Cachorro Quente | R$ 4,00
2      | X-Salada        | R$ 4,50
3      | X-Bacon         | R$ 5,00
4      | Torrada         | R$ 2,00
4      | Refrigerante    | R$ 1,50
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = false;
        int x = 0;

        while(!control) {
            System.out.print("Informe o código do item: ");
            x = sc.nextInt();

            if ( x < 1 || x > 5) {
                System.out.println("Código inválido!");
            } else {
                control = true;
            }
        } 

        System.out.print("Informe a quantidade: ");
        int y = sc.nextInt();

        if(x == 1) {
            System.out.printf("Total: R$ %.2f", 4.00*y);
        }
        if(x == 2) {
            System.out.printf("Total: R$ %.2f", 4.50*y);
        }
        if(x == 3) {
            System.out.printf("Total: R$ %.2f", 5.00*y);
        }
        if(x == 4) {
            System.out.printf("Total: R$ %.2f", 2.00*y);
        }
        if(x == 5) {
            System.out.printf("Total: R$ %.2f", 1.50*y);
        }
    }
}
