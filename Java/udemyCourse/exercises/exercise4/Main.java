/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, 
com duas casas
decimais
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeNumber;
        int workHours;
        double amountPerHour;

        System.out.println("Número do funcionário:");
        employeeNumber = sc.nextInt();
        System.out.println("Horas trabalhadas:");
        workHours = sc.nextInt();
        System.out.println("Valor da hora:");
        amountPerHour = sc.nextDouble();

        double salary = workHours * amountPerHour;

        System.out.printf("Number = %d%n", employeeNumber);
        System.out.printf("Salário = %.2f", salary);
    }
}
