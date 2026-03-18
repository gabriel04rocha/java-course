import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para descobrir todos os seus divisores: ");

        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("%d é divisível por %d%n", number, i);
            }
        }
        
        sc.close();

    }
}