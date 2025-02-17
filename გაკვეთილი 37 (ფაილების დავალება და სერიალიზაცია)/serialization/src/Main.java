import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("asd", "asd", "asd");
        User user = new User("John", "John123");
        user.address = address;
        System.out.println(user);
        user.sayHello();

        try (
                FileOutputStream fos = new FileOutputStream("output.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(user);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                FileInputStream fis = new FileInputStream("output.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            User deserializedUser = (User) ois.readObject();
            System.out.println(deserializedUser);
            deserializedUser.sayHello();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}