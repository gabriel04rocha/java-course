import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite três valores com decimal especificado separados por espaços: ");

        double numberA = sc.nextDouble();

        double numberB = sc.nextDouble();

        double numberC = sc.nextDouble();

        double triangleArea = numberA * numberC / 2;

        double circleArea = 3.14159 * Math.pow(numberC, 2);

        double trapeziumArea = (numberA + numberB) * numberC / 2;

        double squareArea = Math.pow(numberB, 2);

        double rectangleArea = numberA * numberB;

        System.out.printf("Área do triângulo: %.3f%n", triangleArea);
        System.out.printf("Área do círculo: %.3f%n", circleArea);
        System.out.printf("Área do trapézio: %.3f%n", trapeziumArea);
        System.out.printf("Área do quadrado: %.3f%n", squareArea);
        System.out.printf("Área do retângulo: %.3f", rectangleArea);
        
        sc.close();
    }
}
