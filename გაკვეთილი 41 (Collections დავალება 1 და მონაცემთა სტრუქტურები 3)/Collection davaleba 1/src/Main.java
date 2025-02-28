import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
//        savarjisho1();

//        ArrayList<Integer> list = new ArrayList<>(
//                List.of(4,2,7,78,8,32,23,7,23)
//        );
//        savarjisho2(list);

//        savarjisho3();


        Library library = new Library();
        library.populateList("books.txt");
        library.printBooks();
    }

    static void savarjisho1() {
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(rand.nextInt(51));
        } while (!list.contains(40));
        System.out.println("სიის ზომაა: " + list.size());

        printIntList(list);
        System.out.println();

        // v1
//        list.removeIf(x -> x % 2 == 0);

        // v2
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int x : list) {
            if (x % 2 == 0) {
                evenNumbers.add(x);
            }
        }
        list.removeAll(evenNumbers);


        printIntList(list);
    }

    static void savarjisho2(List<Integer> list) {
        System.out.print("List of {");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.getLast() + "}");
    }

    static void savarjisho3() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(51);
        }
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : array) {
            list.add(x);
        }
        System.out.println(list);

//        int maxIndex = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > list.get(maxIndex)) {
//                maxIndex = i;
//            }
//        }
//        System.out.println(maxIndex);
    }

    static void printIntList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}