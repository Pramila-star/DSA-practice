package bitManipulation;

public class ith_bitOfNum {
    public static void main(String args[]){
        int n = 59;
        int i = 4;
        int ans = ithNum(n , i);
        System.out.println(ans);
    }
    
    private static int ithNum(int n, int i){
        return (n >> i) & 1;
    }

    static int setBit(int n , int i){
        return n | (1 << i);
    }

    static int resetBit(int n , int i){
        return n & ~ (1 << i);
    }
}
