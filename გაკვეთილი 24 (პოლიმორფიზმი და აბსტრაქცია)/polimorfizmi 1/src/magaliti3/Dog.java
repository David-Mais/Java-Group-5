package magaliti3;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("*Bark bark*");
    }

//    public abstract void go();
}
