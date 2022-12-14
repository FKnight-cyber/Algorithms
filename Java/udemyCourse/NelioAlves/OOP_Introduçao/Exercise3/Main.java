/*
Fazer um programa que leia o nome de um aluno e três notas que ele obteve nos três trimestres do ano
( primeiro trimestre vale 30, o segundo e terceiro valem 35 pontos cada).
Ao final, mostrar qual a nota final do aluno no ano.
Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
Você deve criar uma classe Student para resolver esse problema.
 */

package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Nota1: ");
        int n1 = sc.nextInt();
        System.out.print("Nota2: ");
        int n2 = sc.nextInt();
        System.out.print("Nota3: ");
        int n3 = sc.nextInt();

        Student student = new Student();

        student.name = name;
        student.nota1 = n1;
        student.nota2 = n2;
        student.nota3 = n3;

        System.out.printf("Final grade: %d%n", student.notaFinal());
        if(student.approved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %d POINTS", 100 - student.notaFinal());
        }

        sc.close();
    }
}
