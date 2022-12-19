/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */

package Exercise10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int n = sc.nextInt();

        Students[] students = new Students[n];

        sc.nextLine();

        for(int i = 0; i < students.length; i++) {
            System.out.printf("Nome do aluno %d: ", i+1);
            String name = sc.nextLine();

            System.out.print("Nota do 1ª Semestre: ");
            double grade1 = sc.nextDouble();

            System.out.print("Nota do 2ª Semestre: ");
            double grade2 = sc.nextDouble();

            sc.nextLine();

            students[i] = new Students(name, grade1, grade2);
        }

        System.out.println("\nAprovados:");
        for(int i = 0; i < students.length; i++) {
            if(students[i].approved()) {
                System.out.printf("\n%s", students[i].getName());
            }
        }

        sc.close();
    }
}
