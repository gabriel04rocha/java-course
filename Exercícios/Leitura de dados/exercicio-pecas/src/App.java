import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código, número e valor unitário de peças 1 separados por espaços: ");

        int code1 = sc.nextInt();

        int number1 = sc.nextInt();

        double price1 = sc.nextDouble();

        System.out.print("Digite o código, número e valor unitário de peças 2 separados por espaços: ");

        int code2 = sc.nextInt();

        int number2 = sc.nextInt();

        double price2 = sc.nextDouble();

        double pricetoPay = number1 * price1 + number2 * price2;

        System.out.printf("O valor a ser pago é %.2f.", pricetoPay);
        
        sc.close();

    }
}
