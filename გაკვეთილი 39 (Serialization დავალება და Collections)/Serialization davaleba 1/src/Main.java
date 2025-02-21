import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Formattable;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("შეიყვანეთ ინფორმაცია " + (i + 1) + " ქვეყნისთვის.");
            System.out.print("შეყვანე სახელი: ");
            String name = scanner.nextLine();

            System.out.print("შეყვანე მოსახლეობა: ");
            int population = scanner.nextInt();

            System.out.print("შეყვანე ფართობი: ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        for (Country country : countries) {
            System.out.println(country);
        }
        System.out.println();

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("countries.txt")
                )
        ) {
            oos.writeObject(countries);
        } catch (IOException e) {
            System.out.println(e);
        }


        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("countries.txt")
                )
        ) {
            Country[] deserialized = (Country[]) ois.readObject();

            for (Country country : deserialized) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}