/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horário do inicio do jogo: ");
        int x = sc.nextInt();

        System.out.print("Horário do fim de jogo: ");
        int y = sc.nextInt();

        if (y <= x) {
            int horas = 24 + y - x;
            System.out.printf("O jogo durou %d horas", horas);
        } else {
            System.out.printf("O jogo durou %d horas", y-x);
        }
    }
}
