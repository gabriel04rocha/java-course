package application;

import entities.Products;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome e o preço do produto no estoque separado por espaços: ");

        String name = sc.next();

        double price = sc.nextDouble();

        Products productOne = new Products(name, price);
        
        int productQuantity;

        int option;
        
        do {

            System.out.print("\nO que você deseja fazer?\n1. Adicionar produtos\n2. Remover produtos\n3. Checar valor total de produtos\n4. Sair\n\nSua escolha: ");

            option = sc.nextInt();

            switch (option) {
            case 1:
                System.out.print("\nQuantos produtos você deseja adicionar no estoque? ");

                productQuantity = sc.nextInt();

                productOne.addProducts(productQuantity);

                break;

            case 2:

                if (productOne.getQuantity() > 0) {

                    System.out.printf("\nHá %d produtos no estoque. Quantos produtos você deseja remover? ", productOne.getQuantity());

                    productQuantity = sc.nextInt();
                    
                    while (productQuantity > productOne.getQuantity()) {
    
                        System.out.print("\nVocê não pode remover mais produtos do que há no estoque! Digite a quantidade novamente: ");
    
                        productQuantity = sc.nextInt();
    
                    }

                    productOne.removeProducts(productQuantity);

                } else {

                    System.out.print("\nHá 0 desse produto no estoque. Não é possível remover!\n\n");

                }

                break;

            case 3:
                System.out.printf("\nHá R$%.2f em produtos no estoque.\n\n", productOne.totalValueInStock()); 
                break;
            
            case 4:
                System.out.println("Até logo!");
                break;

            default:
                System.out.println("\nOpção inválida!");
                break;
            }
        } while (option != 4);

        sc.close();

    }
}
