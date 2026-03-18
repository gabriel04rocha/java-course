import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double price;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do item e a quantidade dele: ");

        int code = sc.nextInt();

        int quantity = sc.nextInt();
        


        if (code == 1) {
            price = quantity * 4.00;
        } else if (code == 2) {
            price = quantity * 4.50;
        } else if (code == 3) {
            price = quantity * 5.00;
        } else if (code == 4) {
            price = quantity * 2.00;
        } else {
            price = quantity * 1.50;
        }

        System.out.printf("o preço a ser pago é R$%.2f", price);
        
        sc.close();

    }
}
