package Recursion;

public class fabonacci {
    public static void main(String args[]) {
        System.out.println(fabonacciNum(6));
       
    }

    static int fabonacciNum(int n){
        if (n <= 1) {
            return n;
        }

       return fabonacciNum(n-1) + fabonacciNum(n -2);
       
    }
    
}
