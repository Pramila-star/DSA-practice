package bitManipulation;

public class PascalsTriSum {
    public static void main(String args[]){
        int n = 5;
        System.out.println(SumOfNthRow(n));
    }

    static int  SumOfNthRow(int n){
       return 1 << (n-1);
    }
    
}
