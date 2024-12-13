package savarjisho3;

import java.time.LocalDate;

public class ShopTest {
    public static void main(String[] args) {
        Cake cake = new Cake(4, LocalDate.of(2024, 12, 20), 2);
        Milk milk = new Milk(4, LocalDate.of(2024, 12, 20), 2);
        Sandwich sandwich = new Sandwich(4, LocalDate.of(2024, 12, 20), 2);

        Product[] cakes = {cake, milk, sandwich};
    }
}
