package entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("R$%.2f, Quantity: %d, Subtotal: R$%.2f", product.getPrice(), quantity, subTotal());
    }
}
