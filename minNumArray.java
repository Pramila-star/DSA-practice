import java.util.Arrays;

public class minNumArray {
    public static void main(String args[]){
        int[] arr={18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans =arr[i];
            }
        }
        return ans;
    }
    
}

class SearchIn2DArray {
    public static void main(String args[]){
        int[][] arr = {
                {23 , 4},
                {18 , 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
         int target = 34;
         int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){


        for(int i =0; i<arr.length; i++){            
            for(int j =0; j< arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j}; // it was declared and then initialized using new keyword
                }

            }
        }
        return new int[]{-1,-1} ;
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
