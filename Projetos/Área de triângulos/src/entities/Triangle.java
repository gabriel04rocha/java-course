package entities;

public class Triangle {

    public double sideA;

    public double sideB;

    public double sideC;

    public double calculateArea() {

        double p = (sideA + sideB + sideC) / 2;

        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

        return area;

    }

}
