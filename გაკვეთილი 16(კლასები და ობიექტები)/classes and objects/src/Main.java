public class Main {
//    static Car car;
    public static void main(String[] args) {
//        Car myCar = new Car();

//        System.out.println("My car:");
//        System.out.println(myCar.make);
//        System.out.println(myCar.model);
//        System.out.println(myCar.year);
//        System.out.println(myCar.color);
//        System.out.println(myCar.price);

//        myCar.price += 9967.94;
//        System.out.println(myCar.price);
//        myCar.price = 90000.6;
//        System.out.println(myCar.price);

//        Car car1 = new Car();
//        Car car2 = new Car();
//        System.out.println("Car 1: " + car1.make + " " + car1.model);
//        System.out.println("Car 2: " + car2.make + " " + car2.model);

//        Car myNewCar = new Car();
//        System.out.println("Make: " + myNewCar.make);
//        System.out.println("Model: " + myNewCar.model);
//        System.out.println("Year: " + myNewCar.year);
//        System.out.println("Color: " + myNewCar.color);
//        System.out.println("Price: " + myNewCar.price);
//
//        System.out.println(car);

//        Car myCar;
//        System.out.println(myCar); //problem


//        Car myDreamCar = new Car();
//        myDreamCar.make = "Aston Martin";
//        myDreamCar.model = "Valkyrie";
//        myDreamCar.year = 2024;
//        myDreamCar.color = "Slipstream Green";
//        myDreamCar.price = 3_500_000.45;
//        System.out.println(myDreamCar);
//        System.out.println("My dream car: {");
//        System.out.println("\tMake: " + myDreamCar.make);
//        System.out.println("\tModel: " + myDreamCar.model);
//        System.out.println("\tYear: " + myDreamCar.year);
//        System.out.println("\tColor: " + myDreamCar.color);
//        System.out.println("\tPrice: " + myDreamCar.price);
//        System.out.println("}");


//        Car newCar = new Car(
//                "Mercedes",
//                "G63",
//                2022,
//                "Black",
//                150000.43
//        );
//        Car newCar2 = new Car(
//                "Lada",
//                "ნოლშესტი",
//                1973,
//                "White",
//                999_999.99
//        );
//        System.out.println("My dream car: {");
//        System.out.println("\tMake: " + newCar.make);
//        System.out.println("\tModel: " + newCar.model);
//        System.out.println("\tYear: " + newCar.year);
//        System.out.println("\tColor: " + newCar.color);
//        System.out.println("\tPrice: " + newCar.price);
//        System.out.println("}\n");
//        System.out.println("My dream car 2: {");
//        System.out.println("\tMake: " + newCar2.make);
//        System.out.println("\tModel: " + newCar2.model);
//        System.out.println("\tYear: " + newCar2.year);
//        System.out.println("\tColor: " + newCar2.color);
//        System.out.println("\tPrice: " + newCar2.price);
//        System.out.println("}");

        // f(x) = X + 2;
//        int number = 7;
////        System.out.println(
////                f(number)
////        );
//        int result = f(number);
//        System.out.println(result);


        Car actionCar = new Car(
                "McLaren",
                "Senna",
                2018,
                "Orange",
                1_200_000.85
        );
        System.out.println("My dream car 2: {");
        System.out.println("\tMake: " + actionCar.make);
        System.out.println("\tModel: " + actionCar.model);
        System.out.println("\tYear: " + actionCar.year);
        System.out.println("\tColor: " + actionCar.color);
        System.out.println("\tPrice: " + actionCar.price);
        System.out.println("}");

        actionCar.startEngine();
    }

    static int f(int x) {
        return x + 2;
    }

}