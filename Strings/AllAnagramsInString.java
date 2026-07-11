package Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsInString {
    public static List<Integer> findAnagram(String s, String p){
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()){
            return ans;
        }

        int[] pfreq = new int[26];
        int[] windowfreq = new int[26];

        for(int i = 0; i< p.length(); i++){
            pfreq[p.charAt(i)-'a']++;
            windowfreq[s.charAt(i)-'a']++;

        }
        if(Arrays.equals(pfreq, windowfreq)){
            ans.add(0);
        }

        for(int i = p.length(); i < s.length(); i++){
            windowfreq[s.charAt(i) - 'a']++;
            windowfreq[s.charAt(i-p.length())-'a']--;

            if(Arrays.equals(pfreq,windowfreq)){
                ans.add(i-p.length()+1);
            }
        }
         return ans;
    } 

    public static void main(String args[]){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res =  findAnagram(s,p);
        System.out.println(res);
    }
}
