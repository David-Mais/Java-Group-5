import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String name = "Davit";
//        String age = new String("20");
//        System.out.println(age);
//        char[] arr = {'h', 'e', 'l', 'l', 'o'};
//        String text = new String(arr);
//        System.out.println(text);


//        String color = "green";
//        color = "red";
//        String blood = "red";
//        String diff = new String("red");
//        String methodText = getText();
//        System.out.println(color == blood);
//        System.out.println(color == diff);
//        System.out.println(color.equals(diff));
//        System.out.println(methodText == diff);
//        System.out.println(methodText == blood);


        String first = "Davit";
        String last = "Maisuradze";
        System.out.println(first.length());
        System.out.println(last.charAt(4));
        System.out.println(first.equals(last));
        System.out.println(first.equalsIgnoreCase("DAVIT"));
        System.out.println(last.replace("a", "👍"));
        System.out.println(last.replace("Mais", "🧠"));
        System.out.println(first.toUpperCase());
        System.out.println(last.toLowerCase());

        String[] arr = last.split("a");
        System.out.println(Arrays.toString(arr));

        String untrimmed = "     text    ";
        System.out.println(untrimmed);
        System.out.println(untrimmed.trim());
        System.out.println(last.substring(4, 7));
    }

//    public static String getText() {
//        return new String("red");
//    }
}