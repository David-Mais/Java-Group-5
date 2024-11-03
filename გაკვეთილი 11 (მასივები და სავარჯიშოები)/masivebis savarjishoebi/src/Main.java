import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // შექმენით 5 ელემენტიანი სახელების მასივი
        // და დაბეჭდეთ სათითაოდ ყველა ელემენტი მძიმის გამოყოფით ერთ ხაზზე
//        String[] names = {"Andria", "Dachi", "Dimi", "Giorti", "Lekso"};
//        System.out.print("[");
//        for (int i = 0; i < names.length - 1; i++) {
//            System.out.print(names[i] + ", ");
//        }
//        System.out.print(names[names.length - 1] + "]");


        // მთელი რიცხვებხვების 4 ელემენტიანი მასივი
        // დაითვალეთ ამ რიცხვების ჯამი და დაბეჭდეთ
//        int[] numbers = {1,2,3,4};
//        int sum = 0;
//        for (int x : numbers) {
//            sum += x;
//        }
//        System.out.println("Sum: " + sum);


        // { 1,4,8,2 } max = 8, index = 2
        // დაადგინეთ რიცხვების მასივში უდიდესი ელემენტი და ინდექსი
//        int[] arr = {12, 4, 19, 7, 23};
//        int max = arr[0];
//        int index = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//        System.out.println("Index: " + index + ", Max: " + max);


        // გაქვთ მასივი რომელიც უნდა დაბეჭდოთ უკუღმა
//        int[] nums = {1,2,3,4,5};
//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.print(nums[i] + " ");
//        }

//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[nums.length - 1 - i] + " ");
//        }


        // გაქვთ მასივი მთელი რიცხვების
        // დაალაგეთ ზრდადობით
//        int[] arr = {12, 4, 19, 7, 23};
//        Arrays.sort(arr);
//        System.out.println("Sorted array: " + Arrays.toString(arr));


        // გაქვთ ორი მასივი
        // შეაერთეთ ერთ დიდ მასივში
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6};
//        int[] merged = new int[arr1.length + arr2.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            merged[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            merged[arr1.length + i] = arr2[i];
//        }
//
//        for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
//            merged[i] = arr2[i - arr1.length];
//        }
//        System.out.println("Merged array: " + Arrays.toString(merged));


        // გაქვთ რიცხვების მასივი და რიცხვი რომლის პოვნაც გინდათ
        // თუ იპოვეთ დაბეჭდეთ რომ იპოვეთ და ინდექსი სად
        // თუ ვერ იპოვეთ დაბეჭდეთ რომ ვერ იპოვეთ
//        int[] nums = {10, 20, 30, 40, 50};
//        int search = 32;
//        boolean found = false;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == search) {
//                System.out.println("Found at index: " + i);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Not found");
//        }


        // გაქვთ მასივი და შემოგდით ინდექსი და ელემენტი
        // თქვენი მიზანია ამ ინდექსზე ჩაწეროთ ეს ელემენტი
        // ისე რომ თავდაპირველი რიცხვები არ დაიკარგოს
        // {1,2,3,4} ინდექსი=2 და ელემენტი=9
        // {1,2,9,3,4}
        int[] arr = {1,2,3,5};
        int index = 0;
        int element = 99;

        int[] newArr = new int[arr.length + 1];

        // {1,2,3,4,5}
        // i=4 j=3
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("New array: " + Arrays.toString(newArr));
    }
}