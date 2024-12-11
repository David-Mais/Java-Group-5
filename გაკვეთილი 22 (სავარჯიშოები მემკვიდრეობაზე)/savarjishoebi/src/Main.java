import exercise1.Animal;
import exercise1.Zebra;
import exercise2.Airplane;

public class Main {
    public static void main(String[] args) {
//        Zebra zebra = new Zebra();
//        zebra.isWild = true;
//
//        zebra.run();
//        System.out.println("Is zebra wild?: " + zebra.isWild);
//        zebra.mate();
//        zebra.isMammal();
//
//        Animal animal = new Animal(15, "Male");


        Airplane airplane = new Airplane("airplane", 23.4F, 150);
        System.out.println(airplane.describe());
    }
}