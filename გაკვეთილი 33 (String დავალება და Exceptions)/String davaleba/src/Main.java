import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(countDigits("დათა 2004 18 30"));

//        System.out.println(countSentences("Hello World! I am David."));

//        System.out.println(isPalindrome("abba"));
//        System.out.println(isPalindrome("AbBa"));

//        System.out.println(isSubstring("Hello World!", "o Wor"));
//        System.out.println(isSubstring("Hello World!", "HW"));

//        if (isLastCharacterVowel()) {
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Consonant");
//        }

//        System.out.println(reconstructOriginalString("ddddata"));
//        System.out.println(reconstructOriginalString("Zebra"));
//        System.out.println(reconstructOriginalString(null));

//        System.out.println(abbreviate("ინტერნაციონალიზაცია"));
    }

    static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    static int countSentences(String s) {
        int count = 0;
        String sentenceEnding = ".?!;";
        for (char c : s.toCharArray()) {
            if (sentenceEnding.indexOf(c) != -1) {
                count++;
                System.out.println(c + " is in: " + sentenceEnding);
            } else {
                System.out.println(c + " is not in: " + sentenceEnding);
            }
        }
        return count;
    }

    static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    static boolean isLastCharacterVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        char lastChar = input.charAt(input.length() - 1);
        String vowels = "aeiou";
        return vowels.indexOf(lastChar) != -1;
    }

    static String reconstructOriginalString(String s) {
        s = s.toLowerCase();
        StringBuilder original = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            original.append(s.charAt(i));
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i += 2;
            } else {
                i += 1;
            }
        }

        return original.toString();
    }

    static String abbreviate(String s) {
        if (s.length() > 10) {
            int middleNumber = s.length() - 2;
            return s.charAt(0) + String.valueOf(middleNumber) + s.charAt(s.length() - 1);
        } else {
            return s;
        }
    }
}