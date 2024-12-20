public class Car
        extends Vehicle
        implements Movable, EngineActions{
    @Override
    public void go() {
        System.out.println("*car goes*");
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }
}
