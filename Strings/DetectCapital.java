import java.util.Scanner;

public class DetectCapital {
     public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
               word.equals(word.toLowerCase()) ||
               (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = detectCapitalUse(word);

        System.out.println("Valid Capital Usage: " + result);

        sc.close();
    }
}