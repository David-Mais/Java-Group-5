import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    // 1) b
    // 2) a
    // 3) a, b, d
    // 4) c
    // 5) a, c
    // 6) b
    // 7) b ან ც
    // 8) b
    // 9) b
    // 10) c
    // 11) c
    // 12) b
    // 13) a, b, c, d
    // 14) b, d
    // 15) b, c
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        List<Student> students = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(inputFile)
                )
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int year = Integer.parseInt(data[3]);
                double grade = Double.parseDouble(data[4]);
                String[] subjectArr = data[5].split("\\s+");
                List<String> subjects = new ArrayList<>(Arrays.asList(subjectArr));

                Student student = new Student(
                        id,
                        firstName,
                        lastName,
                        year,
                        grade,
                        subjects
                );
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        Collections.sort(students);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(outputFile)
                )
        ) {
            oos.writeObject(students);
        } catch (Exception e) {
            System.out.println(e);
        }


        List<Student> deserializedStudents = null;
        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(outputFile)
                )
        ) {
            deserializedStudents = (List<Student>) ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }

        deserializedStudents.forEach(System.out::println);
    }
}