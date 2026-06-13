package bitManipulation;

public class nth_MagicNo {
    public static void main(String args[]){
        int n = 6;
        System.out.println(findNthMagicNo(n));
    }

    static int findNthMagicNo(int n){
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            n= n>>1;
            ans += last * base;
            base = base * 5;
        }

        return ans;
    }
    
}
