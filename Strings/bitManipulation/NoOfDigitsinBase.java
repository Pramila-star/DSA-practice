package bitManipulation;

public class NoOfDigitsinBase {
    public static void main(String args[]){
        int n = 34567;
         baseDigit(n);
    }

    static void baseDigit(int n){
        int b = 10;

        int ans = (int)(Math.log(n)/Math.log(b)) + 1 ;
        System.out.println(ans);
        

    }
   
    
}
