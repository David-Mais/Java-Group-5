import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n1
//        int[] arr = {1,2,3,4,5};
//        boolean allZero = true;
//        while (true) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + "\t");
//                if (arr[i] != 0) {
//                    allZero = false;
//                }
//            }
//            System.out.println();
//            if (allZero) {
//                break;
//            }
//            System.out.println("Please input a number you want to remove: ");
//            int numToRemove = scanner.nextInt();
//            for (int i = 0; i < arr.length; i++) {
//                if (numToRemove == arr[i]) {
//                    arr[i] = 0;
//                    break;
//                }
//            }
//            System.out.println();
//            allZero = true;
//        }
//        System.out.println("Thank you for playing :)");


        // n2
//        int[] prices = {7,1,5,3,6,4};
//        int minPrice = prices[0];
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            }
//            int profit = prices[i] - minPrice;
//            max = Math.max(max, profit);
//        }
//        System.out.println(max);

        // n3
//        int[] nums = {1,1,3,1,1};
//        boolean isPalindrome = true;
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            if (nums[left] != nums[right]) {
//                System.out.println("Not a palindrome!");
//                isPalindrome =false;
//                break;
//            }
//            right--;
//            left++;
//        }
//        if (isPalindrome) {
//            System.out.println("Palindrome");
//        }

        // n4
//        int[] arr = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};
//        for(int num : arr) {
//            System.out.print(num + "\t");
//        }
//        System.out.println();
//        System.out.print("Please input numbers you want removed: ");
//        int numToRemove = scanner.nextInt();
//        for (int i : arr) {
//            if (numToRemove == i) {
//                continue;
//            }
//            System.out.print(i + "\t");
//        }
    }
}