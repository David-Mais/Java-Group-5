package animals;

public class Cat extends Animal{
    private int lives;

    public Cat(String color, int age, int lives) {
        super(color, age);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
