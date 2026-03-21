package entities;

public class Products {

    public String name;

    public double price;

    public int quantity;

    public Products() {

    }

    public Products(String name, double price, int quantity) {
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        
        return price * quantity;
        
    }

    public void addProducts(int quantity) {

        this.quantity += quantity;

        System.out.printf("\nProduto: %s\nPreço: R$%.2f\nQuantidade: %d\nValor total em estoque: R$%.2f%n\n", name, price, this.quantity, price * this.quantity);

    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;

        System.out.print(toString());
    }

    public String toString() {
        return String.format("\\nProduto: %s\\nPreço: R$%.2f\\nQuantidade: %d\\nValor total em estoque: R$%.2f%n\\n", name, price, quantity, price * quantity);
    }

}
