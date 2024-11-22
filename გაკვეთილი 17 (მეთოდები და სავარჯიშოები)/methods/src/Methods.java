public class Methods {
    double add(double x, double y) {
        return x + y;
    }

    int mult(int x, int y, int z) {
        return x * y * z;
    }

    boolean canBuyAlcohol(int age) {
        // v1
//        if(age >= 18) {
//            return true;
//        }
//        return false;

        // v2
        return age >= 18;
    }


    void printNumber(int start) {
        if (start > 3) {
            return;
        }
        System.out.println(start);
        printNumber(start + 1);
    }

    int fact(int n){
        System.out.println(n);
        if (n == 1 ) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
