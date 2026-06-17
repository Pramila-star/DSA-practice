import java.util.*;
import java.util.Arrays;
public class Arrays1 {
//    public static void main(String[] args) {
//         int[] nums = {3, 4, 5, 12};
 //       System.out.println(Arrays.toString(nums));
//        change(nums);
    
//        System.out.println(Arrays.toString(nums));
//    }
//    static void change(int[] arr){
//        arr[0] = 99;
//    }
}

 class MultiDimension{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      //  int[][] arr = new int[3][3];

    //  int[][] arr = {
    //               {1, 2, 3},
    //               {4, 5, 6},
    //               {7, 8, 9}
    //  };

    int[][] arr = new int[3][2];
    System.out.println(arr.length);

// input

   for (int row = 0; row < arr.length; row++){
       for ( int col = 0 ; col <arr[row].length; col ++){
            arr[row][col] = sc.nextInt();
       }
    }

     // output
 //     for (int row = 0; row < arr.length; row++){
 //      for ( int col = 0 ; col <arr[row].length; col ++){
 //          System.out.print( arr[row][col] + " ");
 //   }
 //   System.out.println();
//}


//       for (int row = 0; row < arr.length; row++){
//           System.out.println(Arrays.toString(arr[row]));
//    }


    for(int[] a : arr){
        System.out.println(Arrays.toString(a));
    }
}
 }