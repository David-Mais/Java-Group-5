import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(
                "Davit",
                "Maisuradze",
                20
        );
        Human h2 = new Human(
                "Lexo",
                "Giorgashvili",
                16
        );
        h1.walk();
        h2.hangout(h1);

        try (
                Scanner scanner = new Scanner(
                        System.in
                )
        ) {
            System.out.print("შეიყვანეთ სახელი: ");
            String firstName = scanner.nextLine();

            System.out.print("შეიყვანეთ გვარი: ");
            String lastName = scanner.nextLine();

            System.out.print("შეიყვანეთ ასაკი: ");
            int age = scanner.nextInt();

            Human human = new Human(
                    firstName,
                    lastName,
                    age
            );
            human.walk();
            human.hangout(h2);
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
    }
}