import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio do círculo: ");

        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("O valor da área é %.4f", area);

        sc.close();
    }
}
