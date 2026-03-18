import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as coordenadas do plano cartesiano separadas por espaço (X Y): ");

        int xAxis =  sc.nextInt();

        int yAxis = sc.nextInt();

        while (xAxis != 0 && yAxis != 0) {
            if (xAxis > 0 && yAxis > 0) {
                System.out.println("Primeiro quadrante.");
            } else if (xAxis < 0 && yAxis > 0) {
                System.out.println("Segundo quadrante.");
            } else if (xAxis < 0 && yAxis < 0) {
                System.out.println("Terceiro quadrante.");
            } else {
                System.out.println("Quarto quadrante.");
            }

            System.out.print("Digite novamente as coordenadas do plano cartesiano separadas por espaço (X Y): ");

            xAxis = sc.nextInt();

            yAxis = sc.nextInt();
        }
        
        sc.close();

    }
}
