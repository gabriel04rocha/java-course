import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");

        String password = sc.next();

        while (!password.equals("2002")) {
            System.out.println("Senha Inválida!");
            System.out.print("Digite novamente a senha: ");
            password = sc.next();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
