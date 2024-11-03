import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // [1,2,3,4]
        // [ [1,2,3], [4,5,6] ]
        // [ [1,2,3]
        //   [4,5,6] ]

        int[] numbers = new int[15];

        int[][] matrix = new int[4][3];


        int[][] twoDNumbers = {{1,2,3}, {4,5,6}};
//        System.out.println(twoDNumbers);
//        System.out.println(twoDNumbers[0]);
//        System.out.println(twoDNumbers[1][1]);
//        System.out.println(twoDNumbers[0][2]);

//        System.out.println(twoDNumbers.length);
//        System.out.println(twoDNumbers[0].length);

//        for (int i = 0; i < twoDNumbers.length; i++) {
//            for (int j = 0; j < twoDNumbers[0].length; j++) {
//                System.out.println("(" + i + ", " + j + ") element is: " + twoDNumbers[i][j]);
//            }
//        }

//        for (int i = 0; i < twoDNumbers.length; i++) {
//            for (int j = 0; j < twoDNumbers[0].length; j++) {
//                System.out.println("(" + j + ", " + i + ") element is: " + twoDNumbers[j][i]);
//            }
//        }


//        for (int[] x : twoDNumbers) {
//            for (int y : x) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }



        // შევავსოთ მასივი შემთხვევითი რიცხვებით
        Random random = new Random();
        int[][] randomMatrix = new int[6][5];
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[0].length; j++) {
                int randomNumber = random.nextInt(1, 100);
                System.out.println(randomNumber);
                randomMatrix[i][j] = randomNumber;
            }
        }

//        for (int[] row : randomMatrix) {
//            for (int column : row) {
//                System.out.print(column + " ");
//            }
//            System.out.println();
//        }


        int[] oneDArray = {1,2,3,4};
//        System.out.println(Arrays.toString(oneDArray));

        // პრობლემაა!!!
//        System.out.println(Arrays.deepToString(oneDArray));


        // ეს ბეჭდავს მისამართებს
//        System.out.println(Arrays.toString(randomMatrix));

//        System.out.println(Arrays.deepToString(randomMatrix));

    }
}