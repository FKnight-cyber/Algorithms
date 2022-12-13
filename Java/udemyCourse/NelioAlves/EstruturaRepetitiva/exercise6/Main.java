/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
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
            double z = sc.nextDouble();
            
            double mediaPonderada = (x*2 + y*3 + z*5)/10;
            System.out.printf("Média %d: %.1f%n",i ,mediaPonderada);
        }
    }
}
