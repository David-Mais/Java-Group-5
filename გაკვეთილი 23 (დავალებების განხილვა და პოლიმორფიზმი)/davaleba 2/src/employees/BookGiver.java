package employees;

public class BookGiver extends LibraryEmployee {
    private String from;
    private String to;

    public BookGiver(String id, String firstName, String lastName, String from, String to) {
        super(id, firstName, lastName);
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
