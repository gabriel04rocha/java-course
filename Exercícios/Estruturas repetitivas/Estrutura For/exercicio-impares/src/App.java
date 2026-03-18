import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");

        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        sc.close();

    }
}
