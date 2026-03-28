package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double biggest = 0;
        int biggestPosition = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int numberQuantity = sc.nextInt();

        double[] numbers = new double[numberQuantity];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Digite um número: ");

            double number = sc.nextInt();

            numbers[i] =  number;

            if (numbers[i] > biggest) {

                biggest = numbers[i];
                biggestPosition = i;

            }

        }

        System.out.printf("Maior valor: %.2f%n", biggest);
        
        System.out.printf("Posição do maior valor: %d", biggestPosition);
        
        sc.close();

        }
}
