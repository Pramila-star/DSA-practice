package bitManipulation;

public class NoIsPowOf2OrNot {
    public static void main(String args[]){
        int n = 49;
        PowOf2(n);
    }
    
    static void PowOf2(int n){
        if((n & (n-1)) == 0){
            System.out.println("it is power of two");
        }
        else{
            System.out.println("not power of two");
        }
    }
}
