import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");

        int iterations = sc.nextInt();

        int squared;

        int cubed;

        for (int i = 1; i <= iterations; i ++) {

            squared =  (int) Math.pow(i, 2);
            cubed = (int) Math.pow(i, 3);

            System.out.printf("%d %d %d%n", i, squared, cubed);
        }
        
        sc.close();

    }
}
