public class Main {
    public static void main(String[] args) {
//        Book book = new Book("Adventures of David", 359);
//        book.printInfo();
//        book.addPages(54);
//        book.printInfo();

        int[] grades = {9,9,10,7,5,3,10};
        Student student = new Student(
                "Davit Maisuradze",
                "kajsdhflkj12l3kjh4lkj1h23",
                grades
        );
        student.displayDetails();
    }
}