import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList(String filename) {
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(filename)
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                String name = info[0];
                int pages = Integer.parseInt(info[1]);
                books.add(
                        new Book(name, pages)
                );
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
