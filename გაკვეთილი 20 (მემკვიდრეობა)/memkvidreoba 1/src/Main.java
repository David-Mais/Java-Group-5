import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("black", 4, true);
        dog.makeSound();
        System.out.println(dog.getAge());
//        dog.super.makesound();
//        Animal.makeSound();

        Cat cat = new Cat("orange", 7, 6);
        cat.makeSound();
    }
}