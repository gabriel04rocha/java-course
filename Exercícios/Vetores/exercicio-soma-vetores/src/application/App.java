package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String finalString = "Vetor resultante:\n";

        System.out.print("Quantos números cada vetor vai ter? ");

        int numberQuantity = sc.nextInt();

        int[] vectorA = new int[numberQuantity];

        int[] vectorB = new int[numberQuantity];

        int[] vectorSum = new int[numberQuantity];

        System.out.println("Digite os valores do primeiro vetor:");

        for (int i = 0; i < vectorA.length; i++) {

            System.out.printf("%dº valor: ", i + 1);

            int number = sc.nextInt();

            vectorA[i] = number;

        }

        System.out.println("Digite os valores do segundo vetor:");

        for (int i = 0; i < vectorB.length; i++) {

            System.out.printf("%dº valor: ", i + 1);

            int number = sc.nextInt();

            vectorB[i] = number;

            vectorSum[i] = vectorA[i] + vectorB[i];

            finalString += String.format("%d\n", vectorSum[i]);

        }

        System.out.print(finalString);
        
        sc.close();

    }
}
