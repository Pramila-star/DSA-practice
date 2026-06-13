package bitManipulation;

public class posOfRightMostSetBit {
    public static void main(String args[]){
        int n = 18;

        System.out.println(rightMostSetBit(n));
    }

    static int rightMostSetBit(int n){
        int pos = 1;

        while(( n & 1)== 0){
            n = n >> 1;
            pos++;
        }
        return pos;
    }
    
}
