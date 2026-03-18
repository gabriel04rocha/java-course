import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int firstValue = sc.nextInt();

        System.out.print("Digite outro número: ");

        int secondValue = sc.nextInt();

        int sum = firstValue + secondValue;

        System.out.printf("A soma do número %d e do número %d é %d.", firstValue, secondValue, sum);

        sc.close();
    }
}
