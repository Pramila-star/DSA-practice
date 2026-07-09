public class RotateString {
    public static boolean rotateString(String s, String goal) {
         return s.length() == goal.length() &&
               (s + s).contains(goal);
    }

    public static void main(String args[]){
         String s1 = "abcde";
        String goal1 = "cdeab";

        String s2 = "abcde";
        String goal2 = "abced";

        System.out.println("Test Case 1:");
        System.out.println("Input: s = \"" + s1 + "\", goal = \"" + goal1 + "\"");
        System.out.println("Output: " + rotateString(s1, goal1)); 

        System.out.println();

        System.out.println("Test Case 2:");
        System.out.println("Input: s = \"" + s2 + "\", goal = \"" + goal2 + "\"");
        System.out.println("Output: " + rotateString(s2, goal2));
    }
} 