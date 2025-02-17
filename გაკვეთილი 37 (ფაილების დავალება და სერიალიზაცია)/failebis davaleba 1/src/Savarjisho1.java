import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Savarjisho1 {
    public static void main(String[] args) {
        String fileName = "src/files/vefxi.txt";
        String[] lines = {
                "შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,",
                "კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;",
                "კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,",
                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი."
        };

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(fileName)
                )
        ) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("ფაილში ჩაწერა წარმატებით დასრულდა!");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
