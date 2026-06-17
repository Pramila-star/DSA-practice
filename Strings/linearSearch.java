public class linearSearch {
    public static void main(String args[]){
        int[] nums= {23, 45, 1, 2,8, -19, -3, 16, -11, 28};
        int key = -19;

        System.out.println(linearSear(nums, key));

        
    }

    static int linearSear(int[] arr, int key){
        if(arr.length == 0){
             return -1;
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i]== key){
                return i;

            }

        }
        return -1;
    }

    static int linearSear2(int[] arr, int key){
        if(arr.length== 0){
            return -1;
        }

        for(int element : arr){
            return element;
        }
         return Integer.MAX_VALUE;
    }
   
}

class SearchInStrings {
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

        //using for each loop
   //     for(char ch: str.toCharArray()){
   //         if(ch == target){
   //             return true;
   //         }
   //     }

        for (int i =0; i < str.length(); i++){
            if( target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String str= "Pramila";
        char target ='m';
        System.out.println(search(str, target));

   //     System.out.println(Arrays.toString(str.toCharArray()));
    }
}