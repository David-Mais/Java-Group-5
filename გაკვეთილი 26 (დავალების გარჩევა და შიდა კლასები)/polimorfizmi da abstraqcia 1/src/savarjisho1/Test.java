package savarjisho1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("რამდენი გვერდი გინდათ მრავალკუთხედს ჰქოდნეს: ");
        int sides = sc.nextInt();
        System.out.print("რა იყოს თითოეული გვერდის სიგრძე: ");
        double length = sc.nextDouble();

        System.out.print("რა იყოს თითოეული სამკუთხედი გვერდის სიგრძე: ");
        double triangleLength = sc.nextDouble();
        System.out.print("რა იყოს თითოეული კვადრატის გვერდის სიგრძე: ");
        double squareLength = sc.nextDouble();

        Polygon polygon = new Polygon(sides, length);
        Triangle triangle = new Triangle(triangleLength);
        Square square = new Square(squareLength);

        System.out.println(polygon.perimeter());
        System.out.println(triangle.perimeter());
        System.out.println(square.perimeter());
    }
}
