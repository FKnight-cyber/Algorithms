/*
Faça um programa para ler o valor do raio de um círculo, 
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raio;
        final double pi = 3.14159;
        double area;

        System.out.println("Informe o raio:");
        raio = sc.nextInt();

        area = Math.pow(raio, 2) * pi;

        System.out.printf("Area = %.2f", area);
    }
}
