class MountainArray {
//   public int findInMountainArray(int target, MountainArray mountainArr) {
    
//}
 int search(int[] arr , int target){
     int peak =   peakIndexInMountainArray(arr);
     int firstTry =  BinarySearch(arr , target , 0 , peak)  ;
    if (firstTry != -1){
        return firstTry;
    }
    // try to search in second half
return BinarySearch(arr , target , peak + 1 , arr.length - 1);
 }

public int peakIndexInMountainArray(int[] arr){
       int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start )/2;
            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
        }else {
            start = mid + 1;
        }
   }
   return start;
}
static int BinarySearch(int[] arr , int target , int s , int end){
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

public static void main(String args[]){
    int[] arr = {1 , 2 , 3 , 4 , 5 , 3 , 1};
    int target = 3;
    MountainArray obj = new MountainArray();
    System.out.println(obj.search(arr , target));
}
}
    
