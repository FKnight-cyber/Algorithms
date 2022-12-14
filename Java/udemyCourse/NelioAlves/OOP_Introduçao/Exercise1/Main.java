package Exercise1;

import java.util.Scanner;

/*
Fazer um programa que leia os valores da largura e altura de um rentângulo.
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle's height and width, respectively");
        double height = sc.nextDouble();
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.height = height;
        rectangle.width = width;

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
    }
}
