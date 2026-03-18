import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");

        double value = sc.nextDouble();

        if (value >= 0 && value <= 25) {
            System.out.print("O valor está entre 0 e 25.");
        } else if (value > 25 && value <= 50) {
            System.out.print("O valor está entre 25 e 50.");
        } else if (value > 50 && value <= 75) {
            System.out.print("O valor está entre 50 e 75.");
        } else if (value > 75 && value <= 100) {
            System.out.print("O valor está entre 75 e 100.");
        } else {
            System.out.print("O valor está fora do intervalo.");
        }
        
        sc.close();

    }
}
