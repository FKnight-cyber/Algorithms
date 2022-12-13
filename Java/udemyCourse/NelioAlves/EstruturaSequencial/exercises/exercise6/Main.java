/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, 
calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double C;

        System.out.println("Informe A");
        A = sc.nextDouble();
        System.out.println("Informe B");
        B = sc.nextDouble();
        System.out.println("Informe C");
        C = sc.nextDouble();

        double triangleArea = A*C/2;
        double circleArea = Math.pow(C,2) * 3.14159;
        double trapeziumArea = (A+B)*C/2;
        double squareArea = Math.pow(B,2);
        double rectangleArea = A*B;

        System.out.printf("Triangle Area = %.3f%n", triangleArea);
        System.out.printf("Circle Area = %.3f%n", circleArea);
        System.out.printf("Trapezium Area = %.3f%n", trapeziumArea);
        System.out.printf("Square Area = %.3f%n", squareArea);
        System.out.printf("Rectangle Area = %.3f%n", rectangleArea);
    }
}
