package savarjisho2;

public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bicycle starts");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops");
    }
}
