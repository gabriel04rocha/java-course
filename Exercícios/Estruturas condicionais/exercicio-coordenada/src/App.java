import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do eixo X e o valor do eixo Y separados por espaços: ");

        double eixoX = sc.nextDouble();

        double eixoY = sc.nextDouble();

        if (eixoX > 0 && eixoY > 0) {
            System.out.print("Quadrante 1.");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.print("Quadrante 2.");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.print("Quadrante 3.");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.print("Quadrante 4.");
        } else if (eixoX == 0 && eixoY != 0) {
            System.out.print("Eixo X.");
        } else if (eixoY == 0 && eixoX != 0) {
            System.out.print("Eixo Y.");
        } else {
            System.out.print("Ponto na origem.");
        }
        
        sc.close();

    }
}
