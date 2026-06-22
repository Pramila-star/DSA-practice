package Strings;

import java.util.Arrays;
public class findAndReplace {
    public String findReplaceString(String s, int[] indices,
                                    String[] sources,
                                    String[] targets) {

        int n = indices.length;
        int[] match = new int[s.length()];

        Arrays.fill(match, -1);

        for (int i = 0; i < n; i++) {
            int idx = indices[i];

            if (s.startsWith(sources[i], idx)) {
                match[idx] = i;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (match[i] >= 0) {
                int k = match[i];

                ans.append(targets[k]);
                i += sources[k].length();
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }

    public static void main(String args[]){
    
        int[] match = new int[5];

        Arrays.fill(match, -1);

        System.out.println(Arrays.toString(match));
    }
}
    

