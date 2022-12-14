import java.util.*;

public class Product {
    private String name;
    private double price;
    private int amountOfProduct;

    public Product(String name, double price, int amountOfProduct) {
        this.name = name;
        this.price = price;
        if (amountOfProduct > 0) {
            this.amountOfProduct = amountOfProduct;
        } else {
            this.amountOfProduct = 1;
        }
    }
    public String getName() {
        return name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return amountOfProduct == product.amountOfProduct && Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amountOfProduct);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;

    }

    @Override
    public String toString() {
        return name;

    }
}


