package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many students for course A? ");
            int studentQuantity = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Insira um número inteiro!");
        }
    }
}