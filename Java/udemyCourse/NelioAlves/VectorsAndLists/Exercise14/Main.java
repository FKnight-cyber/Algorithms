/*
Faça um programa que leia dois números inteiros M e N, depois leia uma matriz de M linhas por N colunas contendo nú-
meros inteiros, podendo haver repetições.
Em seguida, ler um número interio X que pertence à matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */
package Exercise14;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da matriz: ");
        int m = sc.nextInt();

        System.out.print("Informe a quantidade de colunas da matriz: ");
        int n = sc.nextInt();

        Integer[][] matrix = new Integer[m][n];

        System.out.println("\nPreencha a matriz!");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n;j++) {
                System.out.printf("Posição [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nInforme um número pertencente a matriz: ");
        int number = sc.nextInt();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n;j++) {
                if(matrix[i][j] == number) {
                    if(j-1 >= 0 && j-1 < n) {
                        System.out.printf("LEFT: %d\n",matrix[i][j-1]);
                    }
                    if(j+1 >= 0 && j+1 < n) {
                        System.out.printf("RIGHT: %d\n",matrix[i][j+1]);
                    }
                    if(i-1 >= 0 && i-1 < m) {
                        System.out.printf("UP: %d\n",matrix[i-1][j]);
                    }
                    if(i+1 >= 0 && i+1 < m) {
                        System.out.printf("DOWN: %d\n",matrix[i+1][j]);
                    }
                }
            }
        }
    }

}
