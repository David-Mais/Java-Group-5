import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        {1,2,3...97,98,99,100}
        // 1
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(190);
//        nums.add(-18);
//        nums.add(-99);
//        nums.add(19);
//        nums.add(10);
//        nums.add(130);
//        nums.add(-999);
//        nums.add(2);
//        System.out.println(nums);
//
//        Collections.sort(nums);
//        System.out.println(nums);


        // 2
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Davit");
//        list.add("Dachi");
//        list.add("Lexo");
//        list.add("Luka");
//        list.add("Zurab");
//        list.add("Saba");
//        list.add("Sophio");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);


        // 3
//        ArrayList<Car> cars = new ArrayList<>(
//                List.of(
//                        new Car(12, "m5"),
//                        new Car(123, "m1"),
//                        new Car(-123, "m2"),
//                        new Car(65, "m3"),
//                        new Car(9, "m4"),
//                        new Car(1, "ajse"),
//                        new Car(12233, "kajsdo;fijqwe")
//                )
//        );
//        cars.forEach(System.out::println);
//        System.out.println();
//        Collections.sort(cars);
//        cars.forEach(System.out::println);


        // 4
//        String a = "asdfads";
//        String b = "asdfasdf";
//        System.out.println(a.compareTo(b));
//        System.out.println(myCompareMethod(a, b));


        // 5
        List<Car> cars = new ArrayList<>();
        Random random = new Random();
        String[] sampleNames = {
            "Toyota",
            "Honda",
            "Ford",
            "Nissan",
            "Chevy",
            "Volkswagen",
            "BMW",
            "Mercedes",
            "Audi",
            "Hyundai"
        };
        for (int i = 0; i < 25; i++) {
            String name = sampleNames[random.nextInt(sampleNames.length)];
            int id = random.nextInt(10000);
            cars.add(new Car(id, name));
        }

        cars.forEach(System.out::println);
        System.out.println("_____________________________________________");
//        Collections.sort(cars);
//        cars.forEach(System.out::println);
//        System.out.println("_____________________________________________");
        Collections.sort(cars, new CarIdComparator());
        cars.forEach(System.out::println);

    }

    public static int myCompareMethod(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        int minLen = Math.min(lenA, lenB);
        for (int i = 0; i < minLen; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return lenA - lenB;
    }
}