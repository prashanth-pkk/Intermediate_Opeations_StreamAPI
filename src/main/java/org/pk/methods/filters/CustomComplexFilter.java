package org.pk.methods.filters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComplexFilter {
    public static class Product {
        String name;
        String category;
        double price;

        Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }

        public String toString() {
            return name + " " + category + " " + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 800.00),
                new Product("Shirt", "Clothing", 30.00),
                new Product("Sofa", "Furniture", 500.00),
                new Product("Washing Machine", "Home Appliances", 700.00),
                new Product("Headphones", "Electronics", 150.00)
        );
        List<Product> filterProducts = products.stream()
                .filter(m -> m.getCategory().equals("Electronics"))
                .filter(m -> m.getPrice() > 100)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and Sorted Products (Electronics, Price > 100):");
        filterProducts.forEach(System.out::println);

    }
}
