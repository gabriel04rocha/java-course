import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número e seu fatorial será calculado: ");
        
        int number = sc.nextInt();

        if (number != 0) {

            int result = number;
    
            for (int i = number; i > 1; i--) {
    
                result *= i - 1;
    
            }
    
            System.out.printf("O fatorial de %d é %d.", number, result);
            
        } else {

            System.out.println("O fatorial de 0 é 1.");

        }


        sc.close();

    }
}
