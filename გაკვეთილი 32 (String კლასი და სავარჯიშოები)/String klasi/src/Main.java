public class Main {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("abc");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//
//        System.out.println(s1.charAt(0) == s3.charAt(0));
//        System.out.println(s1.equals(s3));
//
//        System.out.println("124".equals(String.valueOf(124)));
//
//        char a = 'a';
//        System.out.println((char) (a - 32));


        // StringBuilder
//        String result1 = "";
//        long startTime1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            result1 += "Hello ";
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("Time: " + (endTime1 - startTime1) + " ms");
//
//        StringBuilder result2 = new StringBuilder();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//            result2.append("Hello ");
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Time: " + (endTime2 - startTime2) + " ms");

//        StringBuilder sb = new StringBuilder();
//        long startTime = System.nanoTime();
//        sb.append("hello");
//        long endTime = System.nanoTime();
//        System.out.println("Time taken: " + (endTime - startTime) + "ns");



//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello World");
//        sb.insert(1, " --hello-- ");
//        sb.delete(1, 12);
//        sb.reverse();
//        sb.setLength(40);
//        System.out.println((int)sb.toString().charAt(36));
//        String text = sb.toString();
//        System.out.println(sb.toString());

//        StringBuffer sb = new StringBuffer();
//        sb.append("Hello World");
//        sb.insert(1, " --hello-- ");
//        sb.delete(1, 12);
//        sb.reverse();
//        sb.setLength(40);
//        System.out.println((int)sb.toString().charAt(36));
//        String text = sb.toString();
//        System.out.println(sb.toString());


        StringBuilder sbuild = new StringBuilder();
        StringBuffer sBuff = new StringBuffer();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sbuild.append("Hello ");
        }
        long endTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sBuff.append("Hello ");
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("String builder: " + (endTime1 - startTime1) + " ms");
        System.out.println("String buffer: " + (endTime2 - startTime2) + " ms");
    }
}