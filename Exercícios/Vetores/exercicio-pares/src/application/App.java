package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int numberQuantity = sc.nextInt();

        int[] numbers = new int[numberQuantity];

        String evenNumbersString = String.format("Números pares:\n");

        int evenNumbersQuantity = 0;

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Digite um número: ");

            int number = sc.nextInt();

            numbers[i] = number;

            if (numbers[i] % 2 == 0) {

            evenNumbersString += String.format("%d ", numbers[i]);
            
            System.out.println(evenNumbersString);

            evenNumbersQuantity++;

            }

        }

        System.out.print(evenNumbersString);

        System.out.printf("\nQuantidade de pares: %d", evenNumbersQuantity);
        
        sc.close();

    }
}
