package entities;

public class Products {

    public String Name;

    public double Price;

    public int Quantity;

    public double totalValueInStock() {
        
        return (double) Price * Quantity;
        
    }

    public void AddProducts(int quantity) {

        Quantity += quantity;

        System.out.printf("\nProduto: %s\nPreço: R$%.2f\nQuantidade: %d\nValor total em estoque: R$%.2f%n\n", Name, Price, Quantity, Price * Quantity);

    }

    public void RemoveProducts(int quantity) {

        Quantity -= quantity;

        System.out.printf("\nProduto: %s\nPreço: R$%.2f\nQuantidade: %d\nValor total em estoque: R$%.2f%n\n", Name, Price, Quantity, Price * Quantity);

    }

}
