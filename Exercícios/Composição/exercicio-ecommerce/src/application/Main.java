package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Data de nascimento: ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dtf);

        Client client = new Client(name, email, birthDate);

        System.out.println("Digite os dados do pedido: ");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("Quantos itens nesse pedido? ");

        int itemQuantity = sc.nextInt();

        Order order = new Order(client, status);

        for (int i = 0; i < itemQuantity; i++) {
            System.out.printf("Digite os dados do %dº produto:\n", i + 1);
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade do produto: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product);

            order.addItem(orderItem);
        }

        System.out.println(order.toString());
        sc.close();
    }
}