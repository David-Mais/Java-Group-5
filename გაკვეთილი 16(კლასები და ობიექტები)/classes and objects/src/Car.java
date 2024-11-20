public class Car {
    // v1
//    String make = "BMW";
//    String model = "M4";
//    int year = 2016;
//    String color = "Dark blue";
//    double price = 55555.67;

    //v2
    String make;
    String model;
    int year;
    String color;
    double price;

    Car(
            String make,
            String model,
            int year,
            String color,
            double price
    ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    void startEngine() {
        // მუშაობს ორივენაირად!!!
        System.out.println(make + " " + this.model + " started the engine!");
    }
}
