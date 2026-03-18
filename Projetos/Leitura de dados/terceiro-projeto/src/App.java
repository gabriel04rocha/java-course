import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite alguma coisa: ");

        String x = sc.next();

        System.out.printf("Você escreveu %s%n", x);

        System.out.print("Digite um número: ");

        int y = sc.nextInt();

        System.out.printf("Você digitou o número %d%n", y);

        System.out.print("Digite um número decimal separado por ponto: ");

        double z = sc.nextDouble();

        System.out.printf("Você digitou o número decimal %.2f%n", z);

        System.out.print("Agora digite um texto, um número inteiro e um número decimal na mesma linha separados por espaços: ");

        String text = sc.next();
        int number = sc.nextInt();
        double floating = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(text);
        System.out.println(number);
        System.out.println(floating);

        System.out.print("Agora digite um número e dados em três linhas inteiras: ");
        
        int number1 = sc.nextInt();
        sc.nextLine(); // serve para consumir a quebra de linha que vem após a entrada do número.
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();

        System.out.println("Você digitou: ");
        System.out.println(number1);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        sc.close();
    }
}