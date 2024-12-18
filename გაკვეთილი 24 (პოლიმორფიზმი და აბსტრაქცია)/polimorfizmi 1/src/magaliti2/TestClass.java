package magaliti2;

public class TestClass {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] transports = {car, bicycle, boat};

        for(Vehicle x : transports) {
            x.go();
        }
    }
}
