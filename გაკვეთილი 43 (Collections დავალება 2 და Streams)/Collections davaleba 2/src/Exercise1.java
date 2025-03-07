import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "banana", "pineapple"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}