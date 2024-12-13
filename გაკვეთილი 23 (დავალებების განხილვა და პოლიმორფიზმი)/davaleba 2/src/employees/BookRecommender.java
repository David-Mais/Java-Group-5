package employees;

import books.Book;
import library.Library;

import java.util.Random;

public class BookRecommender extends LibraryEmployee{
    private double rating;
    private Library library;

    public BookRecommender(String id, String firstName, String lastName, double rating, Library library) {
        super(id, firstName, lastName);
        this.rating = rating;
        this.library = library;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book recommendMeBook() {
        Random rand = new Random();
        int index = rand.nextInt(0, library.getBooks().length);

        return library.getBooks()[index];
    }
}
