package application;

import entities.Account;
import exceptions.AmountException;
import exceptions.NoBalanceException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account userAccount = new Account(holder, initialBalance, number, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            userAccount.withdraw(sc.nextDouble());

            System.out.println("New balance: " + userAccount.getBalance());

        } catch (NoBalanceException | AmountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}