import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int number = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite mais um número: ");
            int innerNumber = sc.nextInt();
            if (innerNumber >= 10 && innerNumber <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
        
        sc.close();
    }
}
