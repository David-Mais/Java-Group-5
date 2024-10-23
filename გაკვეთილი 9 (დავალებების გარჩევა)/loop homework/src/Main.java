import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // სავარჯიშო
//        int sum = 0;
//        for (int i = 10; i < 100; i++) {
//            if (i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        int anotherSum = 0;
//        for (int i = 10; i < 100; i += 5) {
//            anotherSum += i;
//        }
//        System.out.println(anotherSum);


        // სავარჯიშო 2
//        int number = 67987;
//        int digit = 1;
//
//        while (number > 10) {
//            number /= 10;
//            digit++;
//        }
//        System.out.println(digit);

        // სავარჯიშო 3
//        int number = 2;
//        if (number == 2) {
//            System.out.println("მარტივია");
//        }
//        for (int i = 3; i < number; i++) {
//            if (number % i == 0) {
//                System.out.println("მარტივი არაა");
//                break;
//            }
//        }

        // ვარიანტი 2
//        int denominator = 2;
//        int number = 3;
//        if (number == 1) {
//            System.out.println("რიცხვი არაა მარტივი");
//        }
//        while (denominator < number) {
//            if (number % denominator == 0) {
//                System.out.println("რიცხვი არაა მარტივი");
//                break;
//            }
//            denominator++;
//        }
//        if (denominator == number) {
//            System.out.println("რიცხვი მარტივია");
//        }


        // სავარჯიშო 4
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else if (b > a) {
//                b -= a;
//            }
//        }
//        System.out.printf("a = %d, b = %d", a, b);

        // სავარჯიშო 5
//        int digitSum = 0;
//        int currentNum = 0;
//        for (int i = 100; i < 1000; i++) {
//            currentNum = i;
//            while (currentNum != 0) {
//                int digit = currentNum % 10;
//                digitSum += digit;
//                currentNum /= 10;
//            }
//            if (i % digitSum == 0) {
//                System.out.println(i);
//            }
//            digitSum = 0;
//        }


        // სავარჯიშო 6
        // 0 1 1 2 3 5 8...
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements of fibonacci do you want: ");
        int amount = scanner.nextInt() - 2;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < amount; i++) {
            int newNum = a + b;
            System.out.println(newNum);
            a = b;
            b = newNum;
        }
    }
}