package savarjisho2;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("car stops");
    }
}
