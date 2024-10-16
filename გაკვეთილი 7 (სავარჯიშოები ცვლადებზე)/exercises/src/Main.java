import java.util.*;

public class Main {
    public static void main(String[] args) {
        // დაადგინეთ რიცხვი ლუწია თუ კენტი
        int a = 0;
        if (a % 2 == 0) {
            System.out.println("ეს რიცხვი ლუწია");
        } else {
            System.out.println("ეს რიცხვი კენტია");
        }

        // დაადგინეთ რიცხვი დადებითია უარყოფითი თუ ნული
        if (a > 0) {
            System.out.println("რიცხვი დადებითია");
        } else if (a == 0) {
            System.out.println("რიცხვი ნულია");
        } else {
            System.out.println("რიცხვი უარყოფითია");
        }

        // შეამოწმეთ წელიწადი არის თუ არა ნაკიანი
        // 4 ის ჯერადი ნაკიანია
        // 100-ის ჯერადი არაა ნაკიანი
        // მაგრამ 400-ის ჯერადი ისევ ნაკიანია
        int year = 1600;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("ნაკიანი წელია");
        } else {
            System.out.println("არაა ნაკიანი წელი");
        }

        if ((true && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("ნაკიანი წელია");
        } else {
            System.out.println("არაა ნაკიანი წელი");
        }


        // გადაიყვანეთ რიცხვითი ქულა A, B, C...
        // 90 ან მეტი A
        // 80-90მდე B
        // 70 - 80-მდე C
        // F
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანე ქულა: ");
//        int score = scanner.nextInt();
        int score = 88;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }


        // სამი რიცხვიდან იპოვეთ უმცირესი
        // a = 5 b = 10 c = 15
        // უმცირესია a = 5
        int x = 5;
        int y = 10;
        int z = 15;
        if (x < y && x < z) {
            System.out.println("smallest is x");
        } else if (y < x && y < z) {
            System.out.println("smallest is y");
        } else {
            System.out.println("smallest is z");
        }


        // მასა kg, სიმაღლე meter
        // BMI წონა გაყოფილი სიმაღლის კვადრატზე
        // თუ  ნაკლებია 18.5 ზედმეტად დაბალწონიანი
        // თუ ნაკლებია 25 ნორმალური წონაა
        // თუ ნაკლებია 30 ჭარბწწონიანი
        // სხვა ნებისმიერ შემთხვევაში ზედმეტად ჭარბწონიანი
        double height = 1.83;
        double weight = 70;
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("ზედმეტად დაბალწონიანი");
        } else if (bmi < 25) {
            System.out.println("ნორმალური წონა");
        } else if (bmi < 30) {
            System.out.println("ჭარბწწონიანი");
        } else {
            System.out.println("ზედმეტად ჭარბწონიანი");
        }
    }
}