import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String price;
    private String amountOfProduct;

    Set<String> products = new HashSet<>();

    public Product(String amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public Product(String price, String amountOfProduct)  {
        if (price == null) {
            throw new RuntimeException("Заполните карточку товара!");
        } else {
            this.price = price;
        }
        if (amountOfProduct == null) {
           throw new RuntimeException("Заполните карточку товара!");
       } else {
            this.amountOfProduct = amountOfProduct;
        }
   }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(String amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(price, product.price) && Objects.equals(amountOfProduct, product.amountOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, amountOfProduct);
    }

    @Override
    public String toString() {
        return "Цена продукта:-"+ price + ",количество-"+ amountOfProduct;
    }
    public void addProduct() {
        if (products.contains("Банан")) {
        }
        throw new RuntimeException("В списке уже есть бананы,второй раз положить нельзя!");
    }
}


