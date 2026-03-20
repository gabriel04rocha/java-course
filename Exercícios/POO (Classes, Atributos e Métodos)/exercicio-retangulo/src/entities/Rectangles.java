package entities;

public class Rectangles {

    public double height;

    public double width;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return height * 2 + width * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
