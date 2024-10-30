public class Main {
    public static void main(String[] args) {
        // როგორ შევქმნათ მასივები
        int[] scores = new int[5];
        String[] names = {"David", "Paul", "Gela"};

//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//        System.out.println(scores[4]);
//        System.out.println();
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[-1]); java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(names[3]); java.lang.ArrayIndexOutOfBoundsException

        // გადავუყვეთ ციკლებით
//        for (int i = 0; i < 5; i++) {
//            System.out.println(scores[i]);
//        }
//
//        System.out.println(names.length);
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }


        // for each ციკლი მასივებში
        for (String x : names) {
            System.out.println(x);
        }

        for (int nebismieriCvladisSaxeli : scores) {
            System.out.println(nebismieriCvladisSaxeli);
        }
    }
}