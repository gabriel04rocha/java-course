package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client ownerClient;

    public Order(Client ownerClient, OrderStatus status) {
        this.ownerClient = ownerClient;
        this.moment = LocalDateTime.now();
        this.status = status;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        StringBuilder builder = new StringBuilder();
        builder.append("ORDER SUMMARY:\n");
        builder.append(String.format("Order moment: %s%n", moment.format(dtf)));
        builder.append(String.format("Order status: %s%n", status.toString()));
        builder.append(String.format("Client: %s%n", ownerClient.toString()));
        builder.append(String.format("Order items:\n"));
        for (OrderItem orderItem : orderItems) {
            builder.append(orderItem.toString() + "\n");
        }
        builder.append(String.format("Total price: R$%.2f%n", total()));
        return builder.toString();
    }
}
