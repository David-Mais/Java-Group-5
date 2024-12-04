package animals;

public class Dog extends Animal{
    private boolean lovesFetch;

    public Dog(String color, int age, boolean lovesFetch) {
        super(color, age);
        this.lovesFetch = lovesFetch;
    }

    public boolean lovesFetch() {
        return lovesFetch;
    }

    public void setLovesFetch(boolean lovesFetch) {
        this.lovesFetch = lovesFetch;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark bark");
    }
}
