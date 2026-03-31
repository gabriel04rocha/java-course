package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        
        String diagonal = "";

        int negativeNumbers = 0;

        int matrixOrder = sc.nextInt();

        int[][] matrix = new int[matrixOrder][matrixOrder];

        for (int i = 0; i < matrixOrder; i++) {

            System.out.printf("Digite os %d elementos da %d linha: ", matrixOrder, i + 1);
            
            for (int x = 0; x < matrixOrder; x++) {

                matrix[i][x] = sc.nextInt();

                if (x == i) {

                    diagonal += String.format("%d ", matrix[i][x]);

                }

                if (matrix[i][x] < 0) {

                    negativeNumbers++;

                }

            }

        }

        System.out.printf("Diagonal principal:\n%s%n", diagonal);
        System.out.printf("Números negativos:\n%s", negativeNumbers);

        sc.close();

    }
}
