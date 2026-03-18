import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        
        int testNumber = sc.nextInt();

        double value1;
        double value2;
        double value3;

        double mean;

        for (int i = 0; i < testNumber; i++) {

            System.out.print("Digite os três números da média separados por espaços. O primeiro tem peso 2, o segundo tem peso 3 e o terceiro tem peso 5: ");

            value1 = sc.nextDouble();

            value2 = sc.nextDouble();

            value3 = sc.nextDouble();

            mean = (value1 * 2 + value2 * 3 + value3 * 5) / 10;
            
            System.out.printf("A média é %.1f%n", mean);
            
        }
        
        sc.close();

    }
}
