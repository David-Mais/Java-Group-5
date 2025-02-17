import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Savarjisho2 {
    public static void main(String[] args) {
        String fileName = "src/files/vefxi.txt";
        try {
            byte[] bytes = Files.readAllBytes(
                    Paths.get(fileName)
            );
            System.out.println(Arrays.toString(bytes));

            String content = new String(
                    bytes
            );
            System.out.println(content);

            String[] words = content.split("\\s+");
            System.out.println(Arrays.toString(words));
            System.out.println("ფაილში სიტყვების რაოდენობა: " + words.length);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}