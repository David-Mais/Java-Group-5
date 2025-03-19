import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> odds = nums
//                .stream()
//                .filter(n -> n % 2 != 0)
//                .toList();
//        System.out.println(odds);

        // 2
//        List<String> words = Arrays.asList("Hello", "World", "Hello", "World");
//        List<String> upper = words
//                .stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(upper);

        // 3
//        List<Double> numbers = Arrays.asList(1.0,  2.0, 3.0);
//        double sum = numbers
//                .stream()
//                .map(n -> n * n)
//                .reduce(0.0, Double::sum);
//        System.out.println(sum);


        // 4
        // 2 -> 1
        // 3 -> 2
        // 4 -> 1
        // 6 -> 1
        List<String> words = Arrays
                .asList("Java", "is", "fun", "and", "useful");
        Map<Integer, Long> wordCount = words
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(wordCount);
    }
}