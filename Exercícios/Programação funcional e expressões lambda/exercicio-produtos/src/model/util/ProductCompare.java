package model.util;

import model.entities.Product;

import java.util.Comparator;

public class ProductCompare implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
