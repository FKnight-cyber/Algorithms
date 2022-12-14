/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa tera que pagar 6% de IOF
sobre o valor em dólar.
Criar uma classe CurrencyConverter responsável pelos cálculos
 */

package Exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in BRL = %.2f", CurrencyConverter.buyDollars(amount));
    }
}
