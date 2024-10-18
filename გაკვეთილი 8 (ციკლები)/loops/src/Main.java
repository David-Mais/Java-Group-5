public class Main {
    public static void main(String[] args) {
        // while loop
        int sum = 0;
        int counter = 0;

        while (counter <= 5) {
            sum += counter;
            counter++;
            System.out.println("sum = " + sum + " counter = " + counter);
        }

        System.out.println(sum);


        // do while loop
        boolean x = false;
        while (x) {
            System.out.println("Hello from while loop!");
        }

        do {
            System.out.println("Hello from do while loop!");
        } while (false);

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from for loop! this is " + i + "th iteration");
        }

//        for (int i = 0; i < 5; i--) {
//            System.out.println("hello");
//        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Hello");
            System.out.println(i);
        }

        // break keyword
        int c = 0;
        while (true) {
            System.out.println("while true");
            c++;
            System.out.println(c);

            if (c >= 750) {
                break;
            }
        }

        // continue keyword
        int t = -1;
        while (t < 10) {
            t++;
            if (t % 2 == 1) {
                continue;
            }
            System.out.println(t);
        }

        // nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print("(" + i + ", " + j + ", " + k + ") ");
                }
                System.out.println();
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        double seconds = duration / 1000.0;
        System.out.println("This took " + seconds + " seconds");



    }
}