import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[100]);

//        try {
//            System.out.println(arr[100]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

//        FileReader fr = new FileReader("data.txt");

//        try {
//            FileReader fr = new FileReader("data.txt");
//        } catch (FileNotFoundException fnfe) {
//            System.out.println(fnfe.getMessage());
//        }


//        try {
//            readFile("./src/data.txt");
//            readFile("my.txt");
//        } catch (IOException e) {
//            System.out.println("File not found");
//        }






        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter text: ");
//        String text = scanner.nextLine();
//        if (text.length() < 5) {
//            throw new ShortStringException("String length " + text.length() + " is too short");
//        }

        try {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            if (text.length() < 5) {
                throw new ShortStringException("String length " + text.length() + " is too short");
            }
        } catch (ShortStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException, FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}