import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 4 números inteiros separados por espaços: ");
        
        int numberA = sc.nextInt();
        
        int numberB = sc.nextInt();

        int numberC = sc.nextInt();

        int numberD = sc.nextInt();

        int result = numberA * numberB - numberC * numberD;

        System.out.printf("A diferença é: %d", result);

        sc.close();
    }
}
