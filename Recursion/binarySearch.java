package Recursion;

public class binarySearch {
    public static void main(String args[]){
       int[] arr = {2, 4 ,6 , 8 ,10 ,12, 14};
       int target = 10;
        int ans = binSearch(arr , target , 0 , arr.length -1);
        System.out.println(ans);
    }

    static int binSearch(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if( target == arr[mid]) {
            return mid;
        }

        if (target < arr[mid]) {
            return binSearch(arr, target , start, mid -1);
        }

        return binSearch(arr, target, mid + 1, end);
    }
    
}
