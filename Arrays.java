import java.util.Scanner;


public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //    int[] arr= new int[5];
   //    arr[0] = 23; 
    //   arr[1] = 45;
    //   arr[2] = 231;
    //   arr[3] = 378;
    //   arr[4] = 292; 
      // System.out.println(arr[3]);

    //   for(int i = 0; i< arr.length; i++){
    //    arr[i] = sc.nextInt();
    //   }
       
    //   for(int i = 0; i< arr.length; i++){
    //    System.out.println(arr[i]);
   //    }
        
   //    for(int num : arr){
   //     System.out.println(num + " ");
   //    }
   // }
    String[] str  = new String[4];
    for (int i = 0; i< str.length; i++){
         str[i] = sc.next();
    }
    System.out.println(java.util.Arrays.toString(str));
    str[1] = "Pramila";
    
     System.out.println(java.util.Arrays.toString(str));

}
}


