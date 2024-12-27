import java.awt.font.GraphicAttribute;

public class Main {
    public static void main(String[] args) {
        // 1
//        Outer outer = new Outer();
//        outer.somethingElse();
//        System.out.println(outer.text);
//
//        Outer.Inner inner = outer.new Inner();
//        inner.doSomething();

        // 2
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        // 3
//        System.out.println(calculateArea(5));

        // 4
//        Animal animal = new Animal();
//        animal.makeNoise();
//        Animal dog = new Animal(){
//            @Override
//            public void makeNoise() {
//                System.out.println("Bark Bark");
//            }
//        };
//        dog.makeNoise();

        // 5
//        Driveable car = new Driveable(){
//            @Override
//            public void start() {
//                System.out.println("car starts");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("car stops");
//            }
//        };
//        car.start();
//        car.stop();


        // 6
        Single single = () -> System.out.println("Hello this is single method!");
        single.print();
        Single complexSingle = () -> {
            int x = 10;
            int y = 15;
            for (int i = x; i < y; i++) {
                System.out.println("Hello");
            }
        };
        complexSingle.print();
    }

    public static double calculateArea(double radius) {
        class Circle {
            public double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            public double area() {
                return Math.PI * radius * radius;
            }
        }
        Circle circle = new Circle(radius);

        return circle.area();
    }
}