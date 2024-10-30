import javax.swing.plaf.IconUIResource;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // სავარჯიშო 1
//        int a = 15;
//        double sum = 0;
//        for (int i = 1; i <= a; i++) {
//            sum += i;
//        }
//        System.out.println(sum / a);

        // სავარჯიშო 2
//        String binary = "";
//        int decimal = 1623;
//        while(decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);
//
//        long binNumber = Long.parseLong(binary);
//        System.out.println(binNumber);
//
//        int position = 0;
//        while (binNumber > 0) {
//            long lastDigit = binNumber % 10;
//            if (lastDigit == 1) {
//                System.out.print((int) Math.pow(2, position) + " + ");
//            }
//
//            position++;
//            binNumber /= 10;
//        }


        // სავარჯიშო 3
//        for (int i = 1; i <= 15; i += 2) {
//            if (i == 5 || i == 7 || i == 11) {
//                continue;
//            }
//            System.out.println(i);
//        }


        // სავარჯიშო 4
//        Scanner sc = new Scanner(System.in);
//        int binNumber = sc.nextInt();
//        int decimal = 0;
//        int multiplier = 1;
//
//        while (binNumber > 0) {
//            int lastDigit = binNumber % 10;
//
//            decimal += lastDigit * multiplier;
//            binNumber /= 10;
//            multiplier *= 2;
//        }
//        System.out.println(decimal);


        // სავარჯიშო 5
//        Scanner sc = new Scanner(System.in);
//        String binary = "";
//        int decimal = sc.nextInt();
//
//        while (decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);


        // სავარჯიშო 6
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = random.nextInt(100) + 1;
//
//        System.out.println("Guess the number between 1 and 100");
//
//        int attempts = 1;
//        int userNumber = scanner.nextInt();
//        while (userNumber != randomNumber) {
//            if (userNumber < randomNumber) {
//                System.out.print("Try higher: ");
//                userNumber = scanner.nextInt();
//                attempts++;
//            }
//            if (userNumber > randomNumber) {
//                System.out.println("Try lower: ");
//                userNumber = scanner.nextInt();
//                attempts++;
//            }
//        }
//        System.out.println(userNumber + " was the correct number!");
//        System.out.println("It took you " + attempts + " attempts");
    }
}