import java.io.Serializable;

public class Car implements Serializable {
    String brand;
    transient int cylinders;

    public Car(String brand, int cylinders) {
        this.brand = brand;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }
}
