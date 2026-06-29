package bitManipulation;

public class oddRepeatation {
     public static void main(String args[]){
        int[] arr ={2, 2, 3, 2, 7, 7, 8, 7, 8 , 8};
        System.out.println(singleNumber(arr));
     }

     static int singleNumber(int[] arr){
        int result = 0;

        for(int i =0; i< 32; i++){
            int sum = 0;
            for(int num : arr){
              if(((num >> i) & 1)== 1){
                sum++;
            }
        }
        if (sum % 3 != 0){
             result = result | (1 << i);
        }
    }

    return result;
     }

}


