import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    int height;

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
