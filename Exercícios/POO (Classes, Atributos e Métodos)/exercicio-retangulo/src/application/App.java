package application;
import java.util.Scanner;
import entities.Rectangles;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Rectangles rectangle = new Rectangles();

        System.out.print("Digite o valor da largura do retângulo: ");

        rectangle.width = sc.nextDouble();

        System.out.print("Agora digite o valor da altura do retângulo: ");

        rectangle.height = sc.nextDouble();

        System.out.printf("Área: %.2f%n", rectangle.area());

        System.out.printf("Perímetro: %.2f%n", rectangle.perimeter());

        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
        
        sc.close();

    }
}
