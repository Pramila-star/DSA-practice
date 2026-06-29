public class NumStringThatWasSubstring {
      public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";

        int ans = numOfStrings(patterns, word);
        System.out.println(ans);
    }
    
}
