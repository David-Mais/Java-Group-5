import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(divide());

//        System.out.println(divideByInput());

//        try {
//            System.out.println(isNegative(-10));
//        } catch (NegativeNumberException e) {
//            System.err.println(e.getMessage());
//        }

        try {
            System.out.println(squareRoot(-16));
        } catch (NegativeNumberException nne) {
            System.err.println(nne.getMessage());
        }
    }

    static int divide() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("შეიყვანეთ რიცხვი: ");
            int a = scanner.nextInt();
            System.out.print("შეიყვანეთ რიცხვი: ");
            int b = scanner.nextInt();
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("ნულზე ვერ გაყოფ!!!");
        }

        return 0;
    }

    static int divideByInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი: ");
        String input = scanner.nextLine();

//        try {
//            int number = Integer.parseInt(input);
//            return 100 / number;
//        } catch (NumberFormatException nfe) {
//            System.err.println("რიცხვად ვერ გადააქცევ!!!");
//        } catch (ArithmeticException ae) {
//            System.err.println("ნულზე ვერ გაყოფ!!!");
//        }

        try {
            int number = Integer.parseInt(input);
            return 100 / number;
        } catch (NumberFormatException | ArithmeticException e) {
            System.err.println("პრობლემაა");
            System.err.println(e.getMessage());
        }

        return 0;
    }

    static boolean isNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("რიცხვი არ უდნა იყოს უარყოფითი!!!");
        }
        return false;
    }

    static double squareRoot(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("უარყოფითი რიცხვიდან ფესვს ვერ ამოიღებ!!!");
        }
        return Math.sqrt(number);
    }
}