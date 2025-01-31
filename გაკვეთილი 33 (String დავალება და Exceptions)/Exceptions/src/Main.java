import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];

//        try {
//            System.out.println(nums[90]);
//            System.out.println("რაღაცა");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ინდექსი მასივის გარეთაა");
//        }
//        System.out.println("მნიშვნელოვანი კოდი");

//        try {
//            System.out.println(nums[90]);
//            char x = "hello".charAt(99);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ინდექსი მასივის გარეთაა");
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("ინდექსი სტრინგის გარეთაა");
//        }
//        System.out.println("მნიშვნელოვანი კოდი");

//        try {
//            System.out.println(nums[90]);
//            char x = "hello".charAt(99);
//        } catch (
//                ArrayIndexOutOfBoundsException |
//                StringIndexOutOfBoundsException e
//        ) {
//            System.out.println("ინდექსი გარეთაა");
//        }
//        System.out.println("მნიშვნელოვანი კოდი");

//        try {
//            System.out.println(nums[90]);
////            char x = "hello".charAt(99);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            System.out.println("ინდექსი მასივის გარეთაა");
//        }
//        System.out.println("მნიშვნელოვანი კოდი");

//        try {
//            throw new RuntimeException("რაღაცა არაყი დავლიეთ");
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            System.out.println(nums[100]);
            char x = "hello".charAt(90);
            int a = 1/0 ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("მასივის ექსეფშენი");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ინდექსი მასივის გარეთაა");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("მნიშვნელოვანი კოდი");
    }
}