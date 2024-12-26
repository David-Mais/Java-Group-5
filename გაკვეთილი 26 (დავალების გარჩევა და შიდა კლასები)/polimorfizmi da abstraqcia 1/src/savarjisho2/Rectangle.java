package savarjisho2;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void shapeName() {
        System.out.println("მართკუთხედი");
    }

    @Override
    public double perimeter() {
        return 2 * (getY() + getX());
    }

    @Override
    public void printInfo() {
        System.out.println();
    }
}
