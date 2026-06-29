package Patterns;

public class AllPatterns {
    public static void main(String args[]){
     //   pattern1(4);
     //   patternRect(5);
     //   patternUltaTri(5);
     //   incNumTri(5);
        halfRhombus(5);
    }
    static void pattern1(int n){
        for(int i = 0; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternRect(int n){
        for(int i = 0; i<= n; i++){
            for(int j = 0; j<= n; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
    }

    static void patternUltaTri(int n ){
        for(int i = 0; i <= n; i++){
            for(int j = i; j<= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void incNumTri(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }

    static void halfRhombus(int n){
        for(int i =0; i<= 2*n; i++){
            int totalColsInRow = i > n ? 2*n -i : i;
            for(int j = 0 ;j < totalColsInRow; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
