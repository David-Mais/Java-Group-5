import java.util.Arrays;

public class Student {
    String name;
    String id;
    int[] grades;

    Student(String name, String id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    double calculateAverage() {
        int sum = 0;
        for(int i : grades) {
            sum += i;
        }
        return sum / (double) grades.length;
    }

    void displayDetails() {
        System.out.println("Student: {");
        System.out.println("\tName: " + name);
        System.out.println("\tId: " + id);
        System.out.println("\tGrades: " + Arrays.toString(grades));
        System.out.println("\tAverage grade: " + calculateAverage());
        System.out.println("}");
    }
}
