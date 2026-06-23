package Strings;

public class findMaxWord {
     public static int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        // Traverse the string and count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch - 'a']++;
        }

        return Math.min(
                Math.min(freq['b' - 'a'], freq['a' - 'a']),
                Math.min(
                    Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2),
                    freq['n' - 'a']
                )
        );
    }

    public static void main(String args[]){
        String text = "loonbalxballpoon";
        String s = "balloon";

       System.out.println(maxNumberOfBalloons(text));
    }
}
