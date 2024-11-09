import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please input rows & columns: ");
        int a = scanner.nextInt();
//        System.out.print("Please input columns: ");
//        int b = scanner.nextInt();
//        if (a != b) {
//            System.out.println("Not a square");
//        }
//        int[][] matrix = new int[a][a];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[i][j] = random.nextInt(3);
//            }
//        }
        int[][] matrix = {
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int magicSum = 0;
        for (int num : matrix[0]) {
            magicSum += num;
        }

        boolean isMagicSquare = true;

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int num : matrix[i]) {
                rowSum += num;
            }
            if (rowSum != magicSum) {
                System.out.println("It is not a magic square");
                isMagicSquare = false;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int columnSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][i];
            }
            if (columnSum != magicSum) {
                System.out.println("Not a magic square");
                isMagicSquare = false;
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != magicSum) {
            System.out.println("Not a magic square");
            isMagicSquare = false;
        }

        int secondDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            secondDiagonalSum += matrix[i][matrix.length - i - 1];
        }
        if (secondDiagonalSum != mainDiagonalSum) {
            System.out.println("Not a magic square");
            isMagicSquare = false;
        }

        if (isMagicSquare) {
            System.out.println("It is a magic square");
        }
    }
}