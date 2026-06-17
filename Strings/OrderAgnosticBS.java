public class OrderAgnosticBS{
    public static void main(String args[]){
            int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
            int target = 22;
            int ans = orderAgnosticBS(arr, target);
            System.out.println(ans);
    }

    static int orderAgnosticBS (int[] arr, int target){
        int s = 0;
        int end  = arr.length-1;

        boolean isAsc = (arr[s] < arr[end]);


     while (s <= end){
        int mid = s + (end-s)/2;

        if (arr[mid] == target){
            return mid;
        }

        if(isAsc) {

        if(target < arr[mid]){
            end = mid -1;
        }else{
            s = mid + 1;
        }
     }else{
        if (target > arr[mid]){
            end = mid -1;
        }else{
            s = mid + 1;
        }
     }
    
    }
     return -1;
}
}