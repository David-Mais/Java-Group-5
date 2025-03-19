import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list
//                .stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(System.out::println);

//        list
//                .stream()
//                .map(n -> Math.pow(n, 3) + 1)
//                .map(Double::intValue)
//                .forEach(System.out::println);

//        list
//                .stream()
//                .limit(3)
//                .forEach(System.out::println);

//        List<List<String>> words = Arrays.asList(
//                Arrays.asList("Data", "Giorgi"),
//                Arrays.asList("Lexo", "Saba"),
//                Arrays.asList("Sophio", "Dachi")
//        );
//        System.out.println(words);
//        List<String> flatMapped = words
//                .stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(flatMapped);


//        List<List<String>> words = Arrays.asList(
//                Arrays.asList("Data", "Giorgi"),
//                Arrays.asList("Lexo", "Saba"),
//                Arrays.asList("Sophio", "Dachi")
//        );
//        System.out.println(words);
//        long count = words
//                .stream()
//                .flatMap(List::stream)
//                .count();
//        System.out.println(count);



        List<String> names = Arrays.asList(
                "Nikolozi", "Dimitri", "Daviti"
        );
//        boolean all = names
//                .stream()
//                .allMatch(s -> s.length() >= 3);
//        System.out.println(all);

//        boolean any = names
//                .stream()
//                .anyMatch(name -> name.length() >= 8);
//        System.out.println(any);

//        List<Integer> nums = Arrays.asList(1, 2, 3);
//        boolean none = nums
//                .stream()
//                .noneMatch(n -> n < 0);
//        System.out.println(none);
    }
}