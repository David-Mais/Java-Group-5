package employees;

public class NoisePolice extends LibraryEmployee{
    private double strictness;

    public NoisePolice(String id, String firstName, String lastName, double strictness) {
        super(id, firstName, lastName);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    public void setStrictness(double strictness) {
        this.strictness = strictness;
    }
}
