package application;

import model.entities.Product;
import model.exceptions.EmptyFileException;
import model.util.ProductCompare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.println("Enter the absolute path to the file: ");

        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
            String newLine = br.readLine();

            if (newLine == null) {
                throw new EmptyFileException("The filepath provided contains an empty file.");
            }

            while (newLine != null) {
                String[] lineInfo = newLine.split(",");
                Product lineProduct = new Product(Double.valueOf(lineInfo[1]), lineInfo[0]);
                products.add(lineProduct);
                newLine = br.readLine();
            }

            Double productpriceAvg = products.stream().map(Product::getPrice).toList().stream().reduce(0.0, Double::sum) / products.size();

            List<Product> underAvg = products.stream().filter(p -> p.getPrice() < productpriceAvg).sorted(new ProductCompare().reversed()).toList();

            System.out.printf("Average price: %.2f%n", productpriceAvg);
            underAvg.forEach(p -> System.out.println(p.getName()));

        } catch (IOException | EmptyFileException e) {
            System.out.println("An exception was found: " + e.getMessage());
        }
    }
}
