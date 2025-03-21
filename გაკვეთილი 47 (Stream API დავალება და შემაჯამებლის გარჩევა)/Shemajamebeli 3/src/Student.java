import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student implements Serializable, Comparable<Student> {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double grade;
    private List<String> subjects;

    public Student(
            int id,
            String firstName,
            String lastName,
            int year,
            double grade,
            List<String> subjects
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        if (this.id != student.getId()) return false;

        Set<String> thisSubjects = new HashSet<>(this.subjects);
        Set<String> studentSubjects = new HashSet<>(student.getSubjects());

        return thisSubjects.equals(studentSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getFirstName(),
                getGrade()
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: {\n");
        sb.append("\tid: ").append(id).append(",\n");
        sb.append("\tfirstName: ").append(firstName).append(",\n");
        sb.append("\tlastName: ").append(lastName).append(",\n");
        sb.append("\tyear: ").append(year).append(",\n");
        sb.append("\tgrade: ").append(grade).append(",\n");
        sb.append("\tsubjects: {\n");
        for (int i = 0; i < subjects.size(); i++) {
            sb.append("\t\t").append(subjects.get(i));
            if(i < subjects.size() - 1) sb.append(", ");
            sb.append("\n");
        }
        sb.append("\t}\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.grade, o.grade);
    }
}
