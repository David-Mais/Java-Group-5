import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        var fileName = "/Users/davidmaisuradze/Mziuri Groups/Java Group 5/გაკვეთილი 38 (ფაილების დავალება, სერიალიზაცია და სავარჯიშოები)/serializacia 2/human.txt";

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(
                                fileName
                        )
                )
        ) {
            Human human = (Human) ois.readObject();
            System.out.println(human);
            System.out.println(
                    ObjectStreamClass
                            .lookup(human.getClass())
                            .getSerialVersionUID()
            );
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}