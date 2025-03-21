import java.util.Arrays;
import java.util.List;

public class Davaleba4 {
    public static void main(String[] args) {
        List<Human> people = Arrays.asList(
                new Human("Alex", 12),
                new Human("Levani", 16),
                new Human("Davit", 20),
                new Human("Sophio", 14),
                new Human("Lexo", 10)
        );

        List<Human> people2 = people
                .stream()
                .filter(h -> h.getAge() >= 15)
                .toList();

        boolean existsLevani = people2
                .stream()
                .anyMatch(h -> "Levani".equals(h.getName()));
        System.out.println(existsLevani);
    }
}
