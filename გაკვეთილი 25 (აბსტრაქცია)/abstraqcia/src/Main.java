import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Movable.name);
//        Movable.name = "Giorgi";

//        Movable movable = new Movable();

        Car car = new Car();
        Movable movable = new Car();
        EngineActions actions = new Car();

        movable.doSomething();
        actions.doSomething();

        car.go();
        car.start();
        car.stop();

        movable.go();
//        movable.start();
//        movable.stop();

        actions.start();
        actions.stop();
//        actions.go();

//        performGo(new Car());

        performDoSomething(movable);
        performDoSomething(actions);
        performDoSomething(new Car());
    }

    static void performGo(Movable movable) {
        movable.go();
    }

    static void performDoSomething(Movable movable) {
        movable.doSomething();
    }

    static void performDoSomething(EngineActions engineActions) {
        engineActions.doSomething();
    }

    static void performDoSomething(Car car) {
        car.doSomething();
    }
}