package savarjisho3;

import java.time.LocalDate;

public class Product {
    private int price;
    private LocalDate expirationDate;

    public Product(int price, LocalDate expirationDate) {
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
