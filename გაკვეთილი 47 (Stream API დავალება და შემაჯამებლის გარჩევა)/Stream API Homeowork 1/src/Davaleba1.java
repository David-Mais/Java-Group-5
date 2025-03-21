import java.util.Arrays;
import java.util.List;

public class Davaleba1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 3, 20, 8);

        int sum = list
                .stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}