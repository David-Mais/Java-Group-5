package savarjisho5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Savarjisho5 {
    public static void main(String[] args) {
        ArrayList<Student> students = getStudents(1_000);
        Collections.sort(students);
        students.forEach(System.out::println);
    }

    static ArrayList<Student> getStudents(int count){
        ArrayList<Student> students = new ArrayList<>();
        Random rand = new Random();
        String[] firstNames = {
                "დავით",
                "დაჩი",
                "დიმი",
                "გიორგი",
                "ლექსო",
                "ლუკა",
                "ნიკუშა",
                "ზურაბ",
                "საბა",
                "სოფიო",
        };
        String[] lastNames = {
                "მაისურაძე",
                "გარდაფხაძე",
                "კურდღელაიძე",
                "კვაჭაძე",
                "გიორგაშვილი",
                "ხარხელაური",
                "გამრეკელაშვილი",
                "ზურაბიშვილი",
                "სილაგაძე",
                "სარსევანიძე",
        };

        for (int i = 0; i < count; i++) {
            int id = rand.nextInt(10_000);
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            Student student = new Student(id, firstName, lastName);
            students.add(student);
        }
        return students;
    }
}
