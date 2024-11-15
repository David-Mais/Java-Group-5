import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        int sum = 0;
//        for (int i : array) {
//            if (i % 2 == 0) sum += i;
//            else sum -= i;
//        }
//        System.out.println(sum);

//        int[][] arr = new int[5][];
//        System.out.println(Arrays.deepToString(arr));

//         int[] arr = {0,1,2,3,4};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[(arr[i] + 3) % arr.length];
//        }
//        System.out.println(arr[1]);


        // 16
//        int[] prices = {1,5,9,2,10,7};
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("ყველაზე იაფია მაღაზიაში სახელად: "
//        + minIndex + " და ღირს: " + minPrice);
//        System.out.println("ყველაზე ძვირია მაღაზიაში სახელად: "
//                + maxIndex + " და ღირს: " + maxPrice);

        // 17
//        for (int i = 0; i <= 100; i++) {
//            if (i % 5 == 0 && i % 7 == 0) {
//                System.out.println("HEYHOW");
//            } else if (i % 7 == 0) {
//                System.out.println("HOW");
//            } else if (i % 5 == 0) {
//                System.out.println("HEY");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 18
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("გთხოვთ შეიყვანოთ რიგების რაოდენობა: ");
//        int rows = scanner.nextInt();
//        System.out.print("გთხოვთ შეიყვანოთ სვეტების რაოდენობა: ");
//        int cols = scanner.nextInt();
//        System.out.println();
//
//        int[][] array = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j] = random.nextInt(100);
//            }
//        }
//
//        System.out.println("დაგენერირებული 2 განზომილებიანი მასივია: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int min = array[0][0];
//        int max = array[0][0];
//        int minRow = 0, minCol = 0;
//        int maxRow = 0, maxCol = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                    minRow = i;
//                    minCol = j;
//                }
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//
//        System.out.println("მინიმალური ელემენტია: " + min
//        + " ინდექსზე (" + minRow + ", " + minCol + ")");
//        System.out.println("მაქსიმალური ელემენტია: " + max
//                + " ინდექსზე (" + maxRow + ", " + maxCol + ")");

        // 19
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
////        int[][] arr2 = {
////                {1,2,3,4},
////                {1,2,3,4},
////                {1,2,3,4},
////                {1,2,3,4}
////        };
//
//        int diagonalSum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            diagonalSum += matrix[i][i];
//            diagonalSum += matrix[i][matrix.length - i - 1];
//        }
//
//        if (matrix.length % 2 == 1) {
//            diagonalSum -= matrix[matrix.length / 2][matrix.length / 2];
//        }
//        System.out.println(diagonalSum);

        // 20
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] arr : matrix) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();
        for(int[] arr : matrix) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        System.out.println();
        for(int[] arr : matrix) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}