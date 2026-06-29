public class palindrome{
    static boolean isPalindrome(String text){
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
    public static void main(String args[]){
        String s1 = "A man, a plan, a canal,Panama";
        String s2 = "RaceCar";
        String s3 = "Hello";

        System.out.println(isPalindrome(s1));
         System.out.println(isPalindrome(s2));
         System.out.println(isPalindrome(s3));
    }
}