package application;

import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Triangle triangleOne = new Triangle();

        Triangle triangleTwo = new Triangle();

        System.out.print("Digite as medidas dos lados do primeiro triângulo: ");

        triangleOne.sideA = sc.nextDouble(); 

        triangleOne.sideB = sc.nextDouble(); 

        triangleOne.sideC = sc.nextDouble();

        System.out.print("Agora digite as medidas dos lados do segundo triângulo: ");

        triangleTwo.sideA = sc.nextDouble(); 

        triangleTwo.sideB = sc.nextDouble(); 

        triangleTwo.sideC = sc.nextDouble();

        double triangleOneArea = triangleOne.calculateArea();

        double triangleTwoArea = triangleTwo.calculateArea();

        System.out.printf("A área do primeiro triângulo é %.4f%n", triangleOneArea);
        System.out.printf("A área do segundo triângulo é %.4f%n", triangleTwoArea);

        if (triangleOneArea > triangleTwoArea) {
            System.out.println("Maior área: Primeiro triângulo.");
        } else if (triangleOneArea == triangleTwoArea) {
            System.out.println("A área de ambos os triângulos é igual.");
        } else {
            System.out.println("Maior área: Segundo triângulo.");
        }
        
        sc.close();

    }
}
