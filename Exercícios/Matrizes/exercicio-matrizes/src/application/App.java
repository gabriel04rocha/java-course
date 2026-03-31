package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas a matriz terá? ");

        int numberOfLines = sc.nextInt();

        System.out.print("Quantas colunas a matriz terá? ");

        int numberOfColumns = sc.nextInt();

        int[][] matrix = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < matrix.length; i++) {

            System.out.printf("Digite os %d valores referentes às colunas da %dº linha: ", numberOfColumns, i + 1);

             for (int x = 0; x < matrix[i].length; x++) {

                matrix[i][x] = sc.nextInt();

            }

        }

        System.out.print("Agora digite um número presente na matriz: ");

        int selectedNumber = sc.nextInt();

        int left, right, top, bottom;

        for (int i = 0; i < matrix.length; i++) {

            for (int x = 0; x < matrix[i].length; x++) {

                if (matrix[i][x] == selectedNumber) {

                    System.out.printf("Position %d,%d%n", i, x);

                    if (x - 1 >= 0) {

                        left = matrix[i][x - 1];
                        System.out.printf("À esquerda: %d%n", left);
                        
                    }
                    
                    if (x + 1 <= (matrix[0].length - 1)) {

                        right = matrix[i][x + 1];
                        System.out.printf("À direita: %d%n", right);

                    }

                    if (i - 1 >= 0) {

                        top = matrix[i - 1][x];
                        System.out.printf("Em cima: %d%n", top);

                    }

                    if (i + 1 >= (matrix.length - 1)) {

                        bottom = matrix[i + 1][x];
                        System.out.printf("Abaixo: %d%n", bottom);

                    }

                }

            }

        }
        

        sc.close();

    }
}
