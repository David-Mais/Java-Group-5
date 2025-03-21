import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Davaleba3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java",
                "Burger",
                "Ice-Cream",
                "Jumberi",
                "Jemali"
        );

        Set<String> sortedWords = words
                .stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(sortedWords);
    }
}
