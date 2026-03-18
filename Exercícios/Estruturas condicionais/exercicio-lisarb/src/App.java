import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui o valor do seu salário usando vírgula: ");

        double salary = sc.nextDouble();

        double tax = 0;

        if (salary < 2000.00) {
            tax = 0;
        } else if (salary < 3000.00) {
            tax = (salary - 2000.00) * 0.08;
        } else if (salary < 4500.00 && salary > 3000.00) {
            tax = (999.99 * 0.08) + ((salary - 3000.01) * 0.18);
        } else if (salary > 4500.00) {
            tax = (999.99 * 0.08) + (1499.99 * 0.18) + ((salary - 4500) * 0.28);
        }

        System.out.printf("O valor do imposto é %.2f.", tax);
        
        sc.close();

    }
}
