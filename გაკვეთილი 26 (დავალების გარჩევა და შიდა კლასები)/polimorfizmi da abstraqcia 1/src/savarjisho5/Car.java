package savarjisho5;

public class Car implements Movable, Turnable{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void left() {
        System.out.println("Car is turning left");
    }

    @Override
    public void right() {
        System.out.println("Car is turning right");
    }
}
