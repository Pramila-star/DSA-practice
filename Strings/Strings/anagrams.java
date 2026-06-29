//package Strings;

import java.util.Arrays;
public class anagrams {
    public static boolean isAnagrams(String s, String t){
       s = s.toLowerCase();
       t = t.toLowerCase();

       if (s.length() != t.length())  return false;

       char[] a = s.toCharArray();
       char[] b = t.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);

       return Arrays.equals(a, b);
    }


    //Usimg frequency Count best Approach

    public static boolean AnagramOrNot(String s, String t){
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i =0; i< s.length(); i++){
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i) - 'a']++;
        }

        for(int c : count){
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String args[]){
         String s1 = "listen";
        String s2 = "silent";

        String s3 = "hello";
        String s4 = "world";

        System.out.println(isAnagrams(s1, s2)); 
        System.out.println(isAnagrams(s3, s4)); 
    }
    
}
