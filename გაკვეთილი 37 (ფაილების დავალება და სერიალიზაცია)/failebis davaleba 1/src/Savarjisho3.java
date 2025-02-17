import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Savarjisho3 {
    public static void main(String[] args) {
        String wordToSearch = "boots";
        String fileName = "src/files/vefxi.txt";

        try {
            String content = new String(
                    Files.readAllBytes(
                            Paths.get(fileName)
                    )
            );

            if (content.contains(wordToSearch)) {
                System.out.println("ვიპოვე სიტყვა: " + wordToSearch + " მოცემულ ფაილში");
            } else {
                System.err.println("ვერ ვიპოვე მსგავსი სიტყვა");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
