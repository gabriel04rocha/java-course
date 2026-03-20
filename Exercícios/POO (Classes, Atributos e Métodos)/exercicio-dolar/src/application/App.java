package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar hoje: ");

        double exchangeRate = sc.nextDouble();

        System.out.print("Quantos dólares você quer comprar? ");

        double dollarQuantity = sc.nextDouble();

        System.out.printf("Quantidade a ser paga em Reais: %.2f", CurrencyConverter.convertToDollar(dollarQuantity, exchangeRate));
        
        sc.close();

    }
}
