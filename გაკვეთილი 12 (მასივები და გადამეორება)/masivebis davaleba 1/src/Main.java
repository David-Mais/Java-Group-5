import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // სავარჯიშო 1
//        int[] b = new int[12];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//
        // სავარჯიშო 2
//        double sum = 0;
//        int product = 1;
//        int length = b.length;
//        for (int i = 0; i < length; i++) {
//            sum += b[i];
//            product *= b[i]; // product = product * b[i]; იგივეა
//        }
//        System.out.print("\nsum: " + (int) sum +
//                "\nproduct: " + product +
//                "\naverage: " + sum / length
//        );

        // სავარჯიშო 3
//        Random random = new Random();
//        int[] a = new int[20];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(21);
//        }
//        int min = a[0];
//        int max = a[0];
//
//        for (int randomNumber : a) {
//            System.out.print(randomNumber + " ");
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//            }
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Min: " + min + "\nMax: " + max);

        // სავარჯიშო 4
//        int[] b = new int[15];
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }

        // სავარჯიშო 5
//        double sum = 0;
//        int product = 1;
//        int length = b.length;
//        for (int i = 0; i < length; i++) {
//            sum += b[i];
//            product *= b[i]; // product = product * b[i]; იგივეა
//        }
//        System.out.print("\nsum: " + (int) sum +
//                "\nproduct: " + product +
//                "\naverage: " + sum / length
//        );


        // სავარჯიშო 6
//        int[] numbers = {1,2,3,4,5};
//        int x = 3;
//        int counter = 0;
//        for (int i : numbers) {
//            if (i == x) {
//                System.out.println("X is in the array!!!");
//                break;
//            }
//            counter++;
//        }
//        if (counter == numbers.length) {
//            System.out.println("X is not in the array");
//        }

        // სავარჯიშო 7.1
//        int[] numbers = {1,2,3,4,5};
//        int[] newNums = new int[numbers.length + 1];
//        int numberToAdd = 999;
//
//        newNums[0] = numberToAdd;
//        for (int i = 0; i < numbers.length; i++) {
//            newNums[i + 1] = numbers[i];
//        }
//        System.out.println(Arrays.toString(newNums));

        // სავარჯიშო 7.2.1
//        int[] numbers = {1,2,3,4,5};
//        int[] newNums = new int[numbers.length + 1];
//        int numberToAdd = 999;
//        newNums[numbers.length] = numberToAdd;
//        for (int i = 0; i < numbers.length; i++) {
//            newNums[i] = numbers[i];
//        }
//        System.out.println(Arrays.toString(newNums));

        // სავარჯიშო 7.2.2
//        int[] numbers = {1,2,3,4,5};
//        int numberToAdd = 999;
//        int[] newNums = Arrays.copyOf(numbers, numbers.length + 1);
//        newNums[numbers.length] = numberToAdd;
//        System.out.println(Arrays.toString(newNums));

        // სავარჯიშო 8
        // i = 1
        // j = 2
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int target = 17;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target && i != j) {
//                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
//                }
//            }
//        }

        // სავარჯიშო 9
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.print("Please input number you want to remove: ");
//        int numToRemove = sc.nextInt();
//
//        int[] newNumbers = new int[numbers.length - 1];
//        int indexToDelete = -1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == numToRemove) {
//                indexToDelete = i;
//                break;
//            }
//        }
//        //      x
//        // {1,2,3,4,5}
//        // {1,2,4,5}
//        // i = 3
//        // curr = 2
//        if (indexToDelete != -1) {
//            int currIndex = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                if (i != indexToDelete) {
//                    newNumbers[currIndex] = numbers[i];
//                    currIndex++;
//                }
//            }
//            System.out.println(Arrays.toString(newNumbers));
//        } else {
//            System.out.println("Number is not in the array!");
//        }



        // სავარჯიშო 10
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("How long should array be?: ");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(101);
        }

        while (true) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += numbers[i];
            }
            if (sum == 0) {
                System.out.println("All numbers are Zero");
                break;
            }
            System.out.println(Arrays.toString(numbers));
            System.out.print("Which number should we turn 0?: ");
            int numberToTurnZero = sc.nextInt();
            for (int i = 0; i < length; i++) {
                if (numbers[i] == numberToTurnZero) {
                    numbers[i] = 0;
                }
            }
        }
    }
}