import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1
//        List<Integer> nums = Arrays.asList(1, 2, 3);
//        Stream<Integer> intStream = nums.stream();

        // 2
//        String[] books = {"book1",  "book2"};
//        Stream<String> bookStream = Arrays.stream(books);
//
//        bookStream.forEach(System.out::println);

        // 3
//        Stream<String> names = Stream.of(
//                "Daviti",
//                "Lexo",
//                "Saba",
//                "Sophio"
//        );
//        names.forEach(System.out::println);


        // 4
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Stream<Integer> stream = nums
//                .stream()
//                .filter(number -> number % 2 == 0);
//        stream.forEach(System.out::println);

        // 5
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Stream<Integer> stream = nums
//                .stream()
//                .map(x -> x * x);
//        stream.forEach(System.out::println);

        // 6
//        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "Daniel", "Emily");
//        Stream<String> stream = names
//                .stream()
//                .map(name -> new StringBuilder(name).reverse().toString());
//        stream.forEach(System.out::println);

        // 7
//        List<Integer> nums = Arrays.asList(9, 17, -3, 0, 1, 99);
//        Stream<Integer> stream = nums
//                .stream()
//                .sorted();
//        stream.forEach(System.out::println);

        // 8
//        List<Human> humans = Arrays.asList(
//                new Human("Giorgi",23),
//                new Human("Daviti",1),
//                new Human("Lexo",1234),
//                new Human("Saba",4),
//                new Human("Sophio",90)
//        );
//        Stream<Human> peopleStream = humans
//                .stream()
////                .sorted(new HumanNameComparator());
//                .sorted();
//        peopleStream.forEach(System.out::println);

        // 9
//        List<String> colors = Arrays.asList("red", "blue", "green", "red", "red", "blue");
//        Stream<String> colorsStream = colors
//                .stream()
//                .distinct();
//        colorsStream.forEach(System.out::println);

        // 10
//        List<Human> humans = Arrays.asList(
//                new Human("Giorgi",23),
//                new Human("Giorgi",23),
//                new Human("Giorgi",23),
//                new Human("Daviti",1),
//                new Human("Lexo",1234),
//                new Human("Saba",4),
//                new Human("Sophio",90)
//        );
//        Stream<Human> stream = humans
//                .stream()
//                .distinct();
//        stream.forEach(System.out::println);

        // 11
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        Stream<String> stream = tasks
//                .stream()
//                .limit(2);
//        stream.forEach(System.out::println);

        // 12
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        Stream<String> stream = tasks
//                .stream()
//                .skip(2);
//        stream.forEach(System.out::println);

        // 13
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        Stream<String> stream = tasks
//                .stream()
//                .skip(1)
//                .sorted()
//                .map(String::toUpperCase);
//        stream.forEach(System.out::println);

        // 14
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        Stream<String> stream = tasks
//                .stream()
//                .skip(1)
//                .sorted()
//                .map(String::toUpperCase);
//        List<String> list = stream.collect(Collectors.toList());
//        System.out.println(list);
//
//        stream.forEach(System.out::println);

        // 15
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        for (int i = 0; i < 5; i++) {
//            Stream<String> stream = tasks
//                    .stream()
//                    .skip(1)
//                    .sorted()
//                    .map(String::toUpperCase);
//            stream.forEach(System.out::println);
//        }

        // 16
        
    }
}