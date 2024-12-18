package magaliti3;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void makeSound() {
//        System.out.println("*Animal sound*");
//    }

    // აბსტრაქტულ მეთოდს ტანი ვერ ექნება
//    public abstract void makeSound() {
//        System.out.println("Animal sound");
//    }

    public abstract void makeSound();
}
