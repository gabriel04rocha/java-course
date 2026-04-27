package application;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import entities.ProductOrder;
import exceptions.DirectoryNotCreatedException;

public class Main {
    public static void main(String[] args) {
        String basePath = "c:\\users\\gabri\\documents\\java-course\\Exercícios\\Manipulação e leitura de arquivos\\";
        File inPath = new File(basePath + "products.csv");
        File outPath = new File(basePath + "out");
        File filePath = null;

        try {
            if (!outPath.exists()) {
                boolean success = outPath.mkdirs();
                if (!success) {
                    throw new DirectoryNotCreatedException("Error while creating out directory");
                }
            }
            filePath = new File(basePath + "out\\summary.csv");
        } catch (DirectoryNotCreatedException e) {
            System.out.println("DirectoryNotCreatedException: " + e.getMessage());
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader(inPath));
                BufferedWriter bwFile = new BufferedWriter(new FileWriter(filePath));
        ) {
            ProductOrder order = null;
            List<String> lines = new ArrayList<>(br.readAllLines());
            List<ProductOrder> orders = new ArrayList<>();
            for (String line : lines) {
                String[] lineValues = line.split(",");
                order = new ProductOrder(lineValues[0], Double.parseDouble(lineValues[1]), Integer.parseInt(lineValues[2]));
                bwFile.write(order.getName() + "," + order.getTotal());
                bwFile.newLine();
                orders.add(order);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception found!");
        } catch(NullPointerException e) {
            System.out.println("NullPointerException: Tried to create a writer with a file object that is null");
        }
    }
}