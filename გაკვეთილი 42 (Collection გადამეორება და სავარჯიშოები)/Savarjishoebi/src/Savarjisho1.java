import java.util.ArrayList;

public class Savarjisho1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i  % 5 == 0) {
                nums.add(i);
            }
        }
        nums.removeIf(x -> isEven(x));

        System.out.println(nums);
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
