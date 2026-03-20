package util;

public class CurrencyConverter {

    public static double convertToDollar(double amount, double exchangeRate) {

        return (amount * exchangeRate) + (amount * exchangeRate * 0.06);

    } 

}
