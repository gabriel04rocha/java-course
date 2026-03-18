import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro negativo ou positivo: ");

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número positivo!");
        }

    }
}
