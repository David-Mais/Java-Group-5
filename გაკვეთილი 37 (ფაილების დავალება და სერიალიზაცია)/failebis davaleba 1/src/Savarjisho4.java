import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Savarjisho4 {
    public static void main(String[] args) {
        String fileOne = "src/files/first.txt";
        String fileTwo = "src/files/second.txt";
        String text =
                """
                Assure polite his real and other figures though. Day age advantages
                and sufficient eating expression traveling. Of on am father by agreed
                supply rather either . Own handsome delicate property mistresses her
                end appetite. Mean are sons too sold nor said. Son share three men
                power by you. Now merits wonder effect garret own.
                """;
        System.out.println(text);

        try (
                PrintWriter pw = new PrintWriter(fileOne)
        ) {
            pw.println(text);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(fileOne)
                );

                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(fileTwo)
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
