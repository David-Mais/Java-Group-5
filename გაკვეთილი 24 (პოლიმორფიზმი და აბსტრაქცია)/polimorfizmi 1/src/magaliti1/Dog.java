package magaliti1;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("*Bark bark*");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("*Bark bark*");
        }
    }
}
