package se.lexicon.LambdaEx1;

import java.util.Objects;

public class Product {
    private String productName;
    private Double price;
    private int stock;

    public Product() {
    }

    public Product(String productName, Double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public Product(String samsung, int i) {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return stock == product.stock && Objects.equals(productName, product.productName) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, stock);
    }
}
