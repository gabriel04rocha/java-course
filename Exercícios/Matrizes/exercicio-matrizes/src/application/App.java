package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas a matriz terá? ");

        int numberOfLines = sc.nextInt();

        System.out.print("Quantas colunas a matriz terá? ");

        int numberOfColumns = sc.nextInt();

        int[][] matrix = new int[numberOfColumns][numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {

            System.out.printf("Digite os %d valores referentes às colunas da %dº linha: ", numberOfColumns, i + 1);

             for (int x = 0; x < numberOfColumns; x++) {

                matrix[x][i] = sc.nextInt();

            }

        }

        System.out.print("Agora digite uma posição da matriz (coluna, linha): ");

        int[] position = {sc.nextInt(), sc.nextInt()};
        
        int left, right, top, bottom;

        if (position[0] - 1 >= 0) {

            left = matrix[position[0] - 1][position[1]];
            System.out.printf("À esquerda: %d%n", left);
            
        }
        
        if (position[0] + 1 <= matrix[0].length - 1) {

            right = matrix[position[0] + 1][position[1]];
            System.out.printf("À direita: %d%n", right);

        }

        if (position[1] - 1 >= 0) {

            top = matrix[position[0]][position[1] - 1];
            System.out.printf("Em cima: %d%n", top);

        }

        if (position[1] + 1 >= matrix.length - 1) {

            bottom = matrix[position[0]][position[1] + 1];
            System.out.printf("Abaixo: %d%n", bottom);

        }
        

        sc.close();

    }
}
