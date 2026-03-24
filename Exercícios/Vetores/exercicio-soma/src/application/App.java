import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int numberQuantity = sc.nextInt();
        
        double[] numbers = new double[numberQuantity];
        
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Digite um número: ");

            double number = sc.nextDouble();

            numbers[i] = number;

        }

        String fullString = "Valores: ";

        double sum = 0;

        
        for (int i = 0; i < numbers.length; i++) {
            
            fullString += String.format("%.2f ", numbers[i]);
            
            sum += numbers[i];
            
        }
        
        double mean = sum / numbers.length;

        System.out.println(fullString);

        System.out.printf("Soma: %.2f%n", sum);
        System.out.printf("Média: %.2f%n", mean);
        
        sc.close();
    }
}
