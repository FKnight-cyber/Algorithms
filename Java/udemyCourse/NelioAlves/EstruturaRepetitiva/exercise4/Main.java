/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
um valor por linha, inclusive o X, se for o caso.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i%2 != 0) {
                System.out.printf("%d%n",i);
            }
        }
    }
}