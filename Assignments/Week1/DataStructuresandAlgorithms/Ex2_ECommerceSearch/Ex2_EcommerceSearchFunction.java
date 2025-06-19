package Assignments.Week1.DataStructuresandAlgorithms.Ex2_ECommerceSearch;

import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }
}


public class Ex2_EcommerceSearchFunction {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "T-Shirt", "Clothing")
        };

        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        String target = "Mobile";

        // Linear Search
        int linIndex = Search.linearSearch(products, target);
        System.out.println("Linear Search: " + (linIndex >= 0 ? products[linIndex] : "Not found"));

        // Binary Search
        int binIndex = Search.binarySearch(products, target);
        System.out.println("Binary Search: " + (binIndex >= 0 ? products[binIndex] : "Not found"));
    }
}
