package bitManipulation;

public class XORtill0toA {
    public static void main(String args[]){
        int a = 6;
        System.out.println(xorTillA(a));
    }

    static int xorTillA(int a){
        if ( a% 4 == 0){
            return a;
        }

        if (a % 4 == 1){
            return 1;
        }

        if (a % 4 == 2){
            return a+1;
        }
        return 0;
    }
    
}
