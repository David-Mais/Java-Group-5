import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Savarjisho5 {
    public static void main(String[] args) {
        String fileOne = "src/files/firstt.txt";
        String fileTwo = "src/files/second.txt";

        try (
                BufferedReader firstReader = new BufferedReader(
                        new FileReader(fileOne)
                );
                BufferedReader secondReader = new BufferedReader(
                        new FileReader(fileTwo)
                );
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("src/files/result.txt")
                )
        ) {
            bw.write("პირველი ფაილი");
            bw.newLine();
            String line;
            while ((line = firstReader.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.write("მეორე ფაილი");
            bw.newLine();
            while ((line = secondReader.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
