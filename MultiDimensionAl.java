import java.util.Arrays;

public class MultiDimensionAl {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         for ( int i = 0; i < 3; i++){
//            list.add(new ArrayList<>());
//         }

//         for(int i = 0; i< 3; i++){
//            for( int j =0 ; j< 3; j++){
//                list.get(i).add(sc.nextInt());
//            }
//         }
//         System.out.print(list);

//    }
}

class swap{
      public static void main(String args[]){
        int[] arr = {1, 3, 23, 9, 18};
        swap(arr , 1 ,3);

        System.out.println(Arrays.toString(arr));
        System.out.println(maxRange(arr,1, 3 ));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
      }

     static void swap(int[] arr, int idx1, int idx2 ){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
     }

     static int max(int[] arr){

        if( arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
         for( int i =1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
         }
         return maxVal;
     }

      static int maxRange(int[] arr, int start, int end){

         if(end>start){
            return -1;
        }

        if (arr == null){
            return -1;
        }
         int maxVal = arr[0];
         for( int i =start; i < end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
         }
         return maxVal;
      }

      static void reverse(int[] arr){
        int start = 0;
         int end = arr.length-1;

         while( start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
         }
      }
}
