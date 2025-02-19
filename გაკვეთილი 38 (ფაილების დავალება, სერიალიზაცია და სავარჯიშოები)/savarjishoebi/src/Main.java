import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String fileName = "car.txt";
        Car car = new Car("Mercedes", 8);
        System.out.println(car);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fileName)
                )
        ) {
            oos.writeObject(car);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(fileName)
                )
        ) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println(deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}