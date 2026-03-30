package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas a matriz terá?");

        int numberOfLines = sc.nextInt();

        System.out.print("Quantas colunas a matriz terá?");

        int numberOfColumns = sc.nextInt();

        int[][] matrix = new int[numberOfColumns][numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {

            System.out.printf("Digite os %d valores referentes às colunas da %dº linha: ", numberOfColumns, i + 1);

             for (int x = 0; x < numberOfColumns; x++) {

                matrix[x][i] = sc.nextInt();

            }

        }

        System.out.print("Agora digite um número que pertence à matriz: ");

        int numberToCheck = sc.nextInt();

        sc.close();

    }
}
