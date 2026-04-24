package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Product product;
        System.out.print("Digite o número de produtos: ");
        int productQuantity = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= productQuantity; i++) {
            System.out.printf("Dados do %dº produto:\n", i);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char productType = sc.next().charAt(0);

            System.out.print("Nome: ");

            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Preço: ");

            Double productPrice = sc.nextDouble();

            switch (productType) {
                case 'i':
                    System.out.print("Taxa de importação: ");
                    Double customFee = sc.nextDouble();
                    product = new ImportedProduct(productName, productPrice, customFee);
                    break;
                case 'u':
                    System.out.print("Data de fabricação: ");
                    LocalDate manufactureDate = LocalDate.parse(sc.next(), formatter);
                    product = new UsedProduct(productName, productPrice, manufactureDate);
                    break;
                default:
                    product = new Product(productName, productPrice);
                    break;
            }

            products.add(product);
        }

        for (Product listProduct : products) {
            System.out.println("Preços: ");
            System.out.println(listProduct.priceTag());
        }
    }
}
