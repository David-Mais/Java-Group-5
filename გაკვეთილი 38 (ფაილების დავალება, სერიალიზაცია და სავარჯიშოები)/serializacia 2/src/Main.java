import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Human";
        human.age = 18;

        long serialVersionUID = ObjectStreamClass
                .lookup(human.getClass())
                .getSerialVersionUID();
        System.out.println(serialVersionUID);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(
                                "human.txt"
                        )
                )
        ) {
            oos.writeObject(human);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(
                                "human.txt"
                        )
                )
        ) {
            Human human1 = (Human) ois.readObject();
            System.out.println(human1);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}