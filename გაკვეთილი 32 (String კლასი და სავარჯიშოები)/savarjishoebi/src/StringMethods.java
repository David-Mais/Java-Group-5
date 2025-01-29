import java.util.Scanner;

public class StringMethods {
    public String findLengthToUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String text = sc.nextLine();

        System.out.println("Length of text: " + text.length());
        return text.toUpperCase();
    }

    public String reversToLowerCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String text = sc.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    public int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // მე ვარ დათა -> ემ რავ ათად
    public String reverseWords(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = new StringBuilder(word)
                    .reverse()
                    .toString();

            sb.append(reversedWord);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
