public class Book {
    String title;
    int pages;
//    Boolean x = null;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void addPages(int number) {
        pages += number;
    }

    void printInfo() {
        System.out.println("Book: {");
        System.out.println("\tTitle: " + title);
        System.out.println("\tPages: " + pages);
        System.out.println("}");
    }
}
