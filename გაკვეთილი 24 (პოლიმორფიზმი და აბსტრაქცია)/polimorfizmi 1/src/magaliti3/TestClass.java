package magaliti3;

public class TestClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Jeka", 4);
//        Animal animal = new Animal("Jeka", 4);
        Animal animalDog = new Dog("Cuga", 2);
        dog.setAge(5);
        System.out.println(animalDog.getName());
        dog.makeSound();
        animalDog.makeSound();

        Cat cat = new Cat("Fiso", 9);
        cat.makeSound();
    }
}
