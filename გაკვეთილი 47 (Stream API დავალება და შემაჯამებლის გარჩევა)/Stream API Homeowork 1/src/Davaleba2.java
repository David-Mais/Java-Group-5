import java.util.Arrays;
import java.util.List;

public class Davaleba2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java",
                "Burger",
                "Ice-Cream",
                "Jumberi",
                "Jemali"
        );
        List<String> words2 = words
                .stream()
                .filter(word -> word.startsWith("J"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(words2);
    }
}
