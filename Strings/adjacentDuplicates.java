public class adjacentDuplicates {
    public static String removeDuplicates(String s) {
       StringBuilder stack = new StringBuilder();

      for (char ch : s.toCharArray()) {
        int len = stack.length();

        if (len > 0 && stack.charAt(len - 1) == ch) {
            stack.deleteCharAt(len - 1);
        } else {
            stack.append(ch);
        }
    }

    return stack.toString();
}

  public static void main(String[] args) {
        String s = "abbaca";

        String result = removeDuplicates(s);

        System.out.println("Original String: " + s);
        System.out.println("After Removing Adjacent Duplicates: " + result);
    }
}
