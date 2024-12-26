package savarjisho2;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Car car2 = new Car();
        Vehicle bicycle = new Bicycle();
        Bicycle bicycle1 = new Bicycle();

        car2.start();
        bicycle1.stop();
    }
}
