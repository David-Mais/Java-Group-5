import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        String hello = "Hello World!";
//
//        char[] chars = hello.toCharArray();
//
//        System.out.println(Arrays.toString(chars));

        // ეს არის პრიმიტიული ტიპები ჯავაში
        boolean isAlive = true;
        byte age = 127;
        short number = 999;
        int trees = 90;
        long height = 15L;
        long longNumber = 9223372036854775807L;
        System.out.println(++longNumber);

        var variable = Long.MAX_VALUE;

        System.out.println(height + longNumber);

        System.out.println(isAlive);
//        age *= 3;
        System.out.println(age);


//        System.out.println("Hello\tworld");


        // ასევე პრიმიტიული ტიპები რომლებიც არამთელ რიცხვებს ინახავენ
        float pi = 3.14f;
        System.out.println(pi);
        double piDouble = 3.123412;
        System.out.println(piDouble);

        char euler = 'e';
        System.out.println(euler);

        // სტრინგი არ არის პრიმიტიული ტიპის ის არის reference ტიპის
        String myName = "Shalva";
        System.out.println(myName);
        System.out.println("My name is: " + myName + ".");


        // გადაკასტვის რამდენიმე მაგალითი
        int a = 250;
        long b = a;
        byte c = (byte) b;
        System.out.println(c);

        int num = 15;
        float numFloat = num;
        System.out.println(numFloat);

        float f = 1.63F;
        // int fNumber = f; არ შეიძლება

        int fNumber = (int) f;
        System.out.println(fNumber);
    }
}