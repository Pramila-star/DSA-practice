package Strings;

public class VowelsOfAllSubstrings {
    public static long countVowels(String word){
        long ans = 0;
        int n = word.length();

        for (int i = 0 ; i< n; i++){
            if(isVowel(word.charAt(i))){
                ans += (long)(i + 1) * (n - i);
            }
        }
        return ans;
    }

    private static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

    public static void main(String args[]){
        String word = "aba";

        System.out.println(countVowels(word));
    }
}
