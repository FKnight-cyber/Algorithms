/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão 
do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if(y == 0) {
                System.out.println("Divisao impossivel!");
                continue;
            }

            double divisao = x/y;
            System.out.printf("Divisão %d: %.1f%n",i ,divisao);
        }
    }
}
