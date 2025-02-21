import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // 1
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Davit");
//        names.add("Dachi");
//        names.add("Dimi");
//        names.add("Giorgi");
//        names.add("Lexo");
//        System.out.println(names);
//
//        System.out.println("Name at index 2: " + names.get(2));
//        System.out.println("Size of list: " + names.size());
//
//        names.remove(3);
//        System.out.println(names);
//
//        names.remove("Dimi");
//        System.out.println(names);
//
//        names.remove("Gocha");
//        System.out.println(names);
//
//        System.out.println("List contains Davit: " + names.contains("Davit"));
//        System.out.println("List contains Gocha: " + names.contains("Gocha"));
//
//        System.out.println("Index of Dachi is: " + names.indexOf("Dachi"));
//
//        System.out.println("Is list empty: " + names.isEmpty());
//
//        names.clear();
//        System.out.println("Is list empty: " + names.isEmpty());

        // 2
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Davit");
//        names.add("Dachi");
//        names.add("Dimi");
//        names.add("Giorgi");
//        names.add("Lexo");
//        System.out.println(names);
//
//        for (String name : names) {
//            names.remove(name); Exception!!!!!
//        }
//
//        for (int i = 0; i < names.size(); i++) {
//            names.remove(i);
//        }
//        System.out.println(names);

        // 3
//        Vector<String> names = new Vector<>();
//        names.add("Davit");
//        names.add("Dachi");
//        names.add("Dimi");
//        names.add("Giorgi");
//        names.add("Lexo");
//        System.out.println(names);

        // 4
//        LinkedList<String> names = new LinkedList<>();
//        names.add("Davit");
//        names.add("Dachi");
//        names.add("Dimi");
//        names.add("Giorgi");
//        names.add("Lexo");
//        System.out.println(names);

//        names.remove("Davit");
//        names.remove();
//        System.out.println(names);


        // 5
//        HashSet<String> names = new HashSet<>();
//        names.add("Davit");
//        names.add("Dachi");
//        names.add("Girogi");
//        System.out.println(names);
//        names.add("Dachi");
//        names.add("Dachi");
//        names.add("Dachi");
//        System.out.println(names);
//        names.add("Gocha");
//        System.out.println(names);
//        names.add(null);
//        names.add(null);
//        names.add(null);
//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names.isEmpty());
//        names.remove(null);
//        names.remove("Dachi");
//        System.out.println(names);


        // 6
        List<Integer> numbers = new ArrayList<>(
                List.of(1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 7, 9, 90)
        );
        System.out.println(numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            uniqueNumbers.add(
                    numbers.get(i)
            );
        }
        System.out.println(uniqueNumbers);
    }
}