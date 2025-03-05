package savarjisho5;

public class Student implements Comparable<Student>{
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int firstCompare = firstName.compareTo(o.getFirstName());
        if (firstCompare != 0){
            return firstCompare;
        }
        int secondCompare = lastName.compareTo(o.getLastName());
        if (secondCompare != 0){
            return secondCompare;
        }

        return -Integer.compare(id, o.getId());
    }
}
