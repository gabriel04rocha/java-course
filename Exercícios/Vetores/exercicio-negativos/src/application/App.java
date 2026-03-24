package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? (Máximo 10) ");

        int numbersToRead = sc.nextInt();

        int[] numbers = new int[numbersToRead];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Digite um número positivo ou negativo: ");

            int number = sc.nextInt();

            numbers[i] = number;
        }

        System.out.println("Números negativos: ");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {

                System.out.println(numbers[i]);

            }

        }
        
        sc.close();

    }
}
