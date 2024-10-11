public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a = " + a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        System.out.println("a = " + --a);

        a += 15;
        System.out.println("a + 15 = " + a);
        a -= 15;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 6;
        System.out.println(a);
        a %= 3;
        System.out.println(a);

        System.out.println(Math.pow(5, 3));


        // შედარების ოპერატორები
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a < b " + (a < b));
        System.out.println("a > b " + (a > b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a >= b " + (a >= b));

        boolean isAMoreThanB = a > b;
        System.out.println("Is A more than B? " + isAMoreThanB);


        boolean x = true;
        boolean y = true;
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("x & y " + (x & y));
        System.out.println("x | y " + (x | y));
        System.out.println("x && y " + (x && y));
        System.out.println("x || y " + (x || y));

        x = false;
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("x & y " + (x & y));
        System.out.println("x | y " + (x | y));
        System.out.println("x && y " + (x && y));
        System.out.println("x || y " + (x || y));

        y = false;
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("x & y " + (x & y));
        System.out.println("x | y " + (x | y));
        System.out.println("x && y " + (x && y));
        System.out.println("x || y " + (x || y));


        boolean z = false;
        boolean result = true || false || true;
        boolean andResult = false && true && false;


        int age = 20;
        boolean isOverEighteen = age >= 18;
        System.out.println("Is over eighteen: " + isOverEighteen);

        if (isOverEighteen) {
            System.out.println("ინებეთ სასმელი");
        } else {
            System.out.println("აჰა კიტრი და ლიმონათი");
        }

        System.out.println("წამოვიდა მაღაზიიდან");


        int temperature = 27;

        if (temperature >= 40) {
            System.out.println("ძააააალიან ცხელა");
        } else if (temperature >= 35) {
            System.out.println("ძალიან ცხელა");
        } else if (temperature >= 25) {
            System.out.println("ცხელა");
        } else if (temperature >= 20) {
            System.out.println("კარგი ტემპერატურაა");
        } else {
            System.out.println("ცივა");
        }





        int dayOfTheWeek = 5;
        switch (dayOfTheWeek){
            case 1:
                System.out.println("ორშაბათი");
                break;
            case 2:
                System.out.println("სამშაბათი");
                break;
            case 3:
                System.out.println("ოთხშაბათი");
                break;
            case 4:
                System.out.println("ხუთშაბათი");
                break;
            case 5:
                System.out.println("პარასკევი");
                break;
            case 6:
                System.out.println("შაბათი");
                break;
            case 7:
                System.out.println("კვირა");
                break;
            default:
                System.out.println("ეგეთი კვირის დღე არ არსებობს");
        }

        if (true) {
            System.out.println(x);
            // break; არ შეიძლება
        }

        String res = (5 > 2) ? "ხუთი მეტია ორზე" :(5 == 2) ? "ხუთი ორის ტოლია" : "ორი ხუთზე მეტია";
        System.out.println(res);

        if (5 > 2) {
            res = "ხუთი მეტია ორზე";
        } else {
            res = "ხუთი არაა მეტი ორზე";
        }


        // ცელსიუსი -> ფარენჰეიტებში
        // ცელსიუსი * (9/5) + 32
        // ცელსიუსი * 1.8 + 32
        int celsius = 19;
        double fahrenheit = 0;

        fahrenheit = celsius * 1.8 + 32;


        System.out.println(fahrenheit);



        // რადიუსი -> წრის ფართობი
        // r -> pi * r * r
        // Math.PI
        // Math.pow(r, 2)
        double r = 5.89;
        double area;

//        area = Math.PI * r * r;
        // savarjisho 1
//        area = Math.PI * Math.pow(r, 2);
//        System.out.println(area);

        // savarjisho 2

    }
}