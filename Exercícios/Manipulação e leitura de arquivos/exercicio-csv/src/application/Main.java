package application;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import entities.ProductOrder;

public class Main {
    public static void main(String[] args) {
        File inPath = new File("..\\products.csv");
        File outPath = new File("..\\out");
        File filePath = new File("..\\out\\summary.csv");
        try (
                BufferedReader br = new BufferedReader(new FileReader(inPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
                BufferedWriter bwFile = new BufferedWriter(new FileWriter(filePath));
        ) {
            ProductOrder order = null;
            List<String> lines = new ArrayList<>(br.readAllLines());
            List<ProductOrder> orders = new ArrayList<>();

            for (String line : lines) {
                String[] lineValues = line.split(",");
                order = new ProductOrder(lineValues[0], Double.parseDouble(lineValues[1]), Integer.parseInt(lineValues[2]));

                orders.add(order);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch(IOException e) {
            System.out.println("IO Exception found!");
        }
    }
}