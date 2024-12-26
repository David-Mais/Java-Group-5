package savarjisho1;

public class Polygon {
    private int sides;
    private double length;

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double perimeter() {
        return length * sides;
    }
}
