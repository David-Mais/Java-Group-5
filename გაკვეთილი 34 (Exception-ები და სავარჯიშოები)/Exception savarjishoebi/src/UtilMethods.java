import java.util.Scanner;

public class UtilMethods {
    public int divide() {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        try {
            System.out.print("Enter an integer: ");
            number1 = scanner.nextInt();
            System.out.print("Enter an integer: ");
            number2 = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("something went wrong");
            return 0;
        }

        try {
            return number1 / number2;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        return 0;
    }

    public int factorial(int n) throws NumberLessThanZeroException {
        if (n < 0) {
            throw new NumberLessThanZeroException("Number cannot be < 0");
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalOperatorException("Invalid operator: " + operator);
        }
    }
}
