import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int count = sc.nextInt();

        double result;

        for (int i = 0; i < count; i++) {

            System.out.print("Digite um par de números e sua divisão será mostrada: ");

            int dividend = sc.nextInt();

            int divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Divisão impossível!");
            } else {
                result = (double) dividend / divisor;
                System.out.printf("Resultado: %.1f%n", result);
            }

        }
        
        sc.close();

    }
}
