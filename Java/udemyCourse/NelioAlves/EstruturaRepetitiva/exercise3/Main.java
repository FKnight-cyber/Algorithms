/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência 
de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. 
Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, 
conforme exemplo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;
        int userInput = 0;

        while(userInput != 4) {
            System.out.printf("Informe o código do combustível %n 1.Álcool %n 2.Gasolina %n 3.Diesel %n 4.Fim %n");
            userInput = sc.nextInt();

            if(userInput < 1 || userInput > 4) {
                System.out.print("Código inválido!");
            }

            if(userInput == 1) {
                alcool++;
            }
            if(userInput == 2) {
                gasolina++;
            }
            if(userInput == 3) {
                diesel++;
            }
            if(userInput == 4) {
                System.out.printf("MUITO OBRIGADO%nÁlcool: %d%nGasolina: %d%nDiesel: %d",
                alcool, gasolina, diesel);
            }
        }
    }
}
