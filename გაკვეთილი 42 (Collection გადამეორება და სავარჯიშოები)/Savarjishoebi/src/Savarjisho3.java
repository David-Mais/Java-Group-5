import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Savarjisho3 {
    public static void main(String[] args) {
        // 1,1,2,7,3,8,9,1,7,4,2,1,1,1,2,7,3,8,9,1,7,4,2,1
        // 1,2,3,4,7,8,9
        Integer[] nums = {1,1,2,7,3,8,9,1,7,4,2,1,1,1,2,7,3,8,9,1,7,4,2,1};
        HashSet<Integer> set = new HashSet<>(
                Arrays.asList(nums)
        );

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
