package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double vectorSum = 0;

        System.out.print("Quantos elementos terá o vetor? ");

        int numberQuantity = sc.nextInt();

        double[] numbers = new double[numberQuantity];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Digite um número: ");

            double number = sc.nextDouble();

            numbers[i] = number;

            vectorSum += numbers[i];

        }

        double vectorMean = vectorSum / numbers.length;

        System.out.printf("Média do vetor: %.2f%n", vectorMean);

        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < vectorMean) {

                System.out.println(numbers[i]);

            }

        }
        
        sc.close();

    }
}
