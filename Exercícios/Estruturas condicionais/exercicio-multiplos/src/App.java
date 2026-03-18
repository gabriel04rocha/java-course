import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números separados por um espaço: ");

        int numberA = sc.nextInt();

        int numberB = sc.nextInt();

        if (numberA % numberB == 0 || numberB % numberA == 0) {
            System.out.println("Números múltiplos!");
        } else {
            System.out.println("Números não múltiplos!");
        }

        sc.close();

    }
}
