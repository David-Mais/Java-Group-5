import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // დაბეჭდეთ რიცხვვები 1-10 ჩათვლით
        // გამოიყენეთ for ციკლი
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // დაბეჭდეთ 1-20 ჩათვლით ყველა ლუწი რიცხვი
        // არ გამოიყენოთ continue
        // გამოიყენეთ for loop
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // დაბეჭდეთ 5-ის პირველი 10 ჯერადი
        // 5 10 15 ... 50
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }

        // დაბეჭდეთ პირვველი x რიცხვის ჯამი (ნატურალურების)
        int x = 5;
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);

        // დაბეჭდეთ გამრავლების ტაბულა
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("____________");
        }

        // იპოვვეთ რიცხვვის ფაქტორიალი
        // 5! = 5 * 4 * 3 * 2 * 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
//        int z = sc.nextInt();

        int factorial = 1;
//        for (int i = 1; i <= z; i++) {
//            factorial *= i;
//        }
//        System.out.println("Factorial of " + z + " is: " + factorial);

//        BigInteger result = factorial(z);
//        System.out.println(result);



        // დაბეჭდეთ *-ებისგან მართკუთხა სამკუთხედი
        // *
        // **
        // ***
        int lines = 10;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // სცადეთ პირამიდის დაბეჭდვა *-ებით
    }

    public static BigInteger factorial(int n) {
        BigInteger one = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            one = one.multiply(BigInteger.valueOf(i));
        }

        return one;
    }
}