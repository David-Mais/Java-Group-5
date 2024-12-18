package magaliti1;

public class TestClass {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        animal.makeSound();
//        dog.makeSound();
//        cat.makeSound();
//        dog.makeSound(3);

//        Animal dog = new Dog();
//        dog.makeSound();


        Animal changingAnimal = new Dog();
        changingAnimal.makeSound();
        changingAnimal = new Cat();
        changingAnimal.makeSound();
        changingAnimal = new Animal();
        changingAnimal.makeSound();
    }
}
