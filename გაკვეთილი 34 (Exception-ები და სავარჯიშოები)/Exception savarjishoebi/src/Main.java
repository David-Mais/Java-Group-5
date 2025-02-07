public class Main {
    public static void main(String[] args) {
        UtilMethods utilMethods = new UtilMethods();
//        System.out.println(utilMethods.divide());

//        System.out.println(utilMethods.factorial(-5));
//        try {
//            System.out.println(utilMethods.factorial(-5));
//        } catch (NumberLessThanZeroException nltze) {
//            System.out.println(nltze.getMessage());
//        }


        try {
//            System.out.println(utilMethods.calculate(15.2, 0, '/'));
            System.out.println(utilMethods.calculate(15.2, 34.2, 'k'));
        } catch (ArithmeticException | IllegalOperatorException e) {
            System.out.println(e.getMessage());
        }
    }
}