import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car>  cars = getCars(100);
//        Collections.sort(cars);
//        Collections.sort(cars, new CarIdComparator());

        Collections.sort(cars,  new CarComparator());
        cars.forEach(System.out::println);
    }

    static ArrayList<Car> getCars(int count) {
        String[] brands = {
                "Toyota",
                "Honda",
                "Ford",
                "Nissan",
                "Mercedes",
        };
        Random rand = new Random();
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int id = rand.nextInt(10_000);
            String brand = brands[rand.nextInt(brands.length)];
            Car car = new Car(id, brand);
            cars.add(car);
        }
        return cars;
    }

}