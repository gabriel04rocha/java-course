package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int evenNumbersSum = 0;

        int evenNumbersQuantity = 0;

        System.out.print("Quantos elementos o vetor terá? ");

        int numbersQuantity = sc.nextInt();

        int[] numbers = new int[numbersQuantity];

        for (int i = 0; i < numbersQuantity; i++) {

            System.out.print("Digite um número: ");

            int number = sc.nextInt();

            numbers[i] = number;

            if (numbers[i] % 2 == 0) {

                evenNumbersSum += numbers[i];

                evenNumbersQuantity++;

            }

        }

        if (evenNumbersQuantity == 0) {

            System.out.println("Nenhum número par.");

        } else {

            double evenNumbersMean = evenNumbersSum / evenNumbersQuantity;

            System.out.printf("Média dos números pares: %.2f", evenNumbersMean);

        }


        
        
        sc.close();

    }
}
