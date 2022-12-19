/*
A dona de um pensionato possui 10 quartos para alugar para estudantes, sendo esses quartos identificados pelos números
0 ao 9.
Faça um programa que inicie com todos os 10 quartos vazios, e depois leia uma quantidade N representando o números de
estudantes que vão alugar quartos. Em seguida, registre o aluguel dos N estudantes.
Para cada registro, informe Nome, Email e o Número do quarto, suponha que seja escolhido um quarto vago.
Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato, por ordem de quarto, conforme
exemplo.
 */

package Exercise12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];

        System.out.print("Informe a quantidade de estudantes que irão alugar um quarto: ");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.printf("Nome do estudante %d: ", i+1);
            String name = sc.nextLine();

            System.out.printf("Email: ", i+1);
            String email = sc.nextLine();

            System.out.print("Nº do quarto: ");
            int roomNumber = sc.nextInt();

            sc.nextLine();

            students[roomNumber] = new Student(name, email, roomNumber);
        }

        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                System.out.printf("\n %d: %s, %s", students[i].getRoom(), students[i].getName(), students[i].getEmail());
            }
        }

        sc.close();
    }
}
