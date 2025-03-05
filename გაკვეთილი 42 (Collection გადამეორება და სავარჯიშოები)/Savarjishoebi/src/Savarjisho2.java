import java.util.LinkedList;

public class Savarjisho2 {
    public static void main(String[] args) {
        // b a c
        LinkedList<String>  list = new LinkedList<>();
        list.add("middle");
        System.out.println(list);

        list.addFirst("start");
        System.out.println(list);

        list.addLast("end");
        System.out.println(list);
    }
}
