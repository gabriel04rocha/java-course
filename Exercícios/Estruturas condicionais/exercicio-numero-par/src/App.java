import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

        sc.close();

    }
}
