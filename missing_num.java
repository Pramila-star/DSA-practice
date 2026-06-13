public class missing_num {
    public static int recursiveSum(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }else{
           return arr[idx]+recursiveSum(arr,idx+1);
    
        }
    }
        public static void main(String args[]){
            int arr[]={0,2,3,4,5,6,7};
            int actualSum=(arr.length*(arr.length+1))/2;
           int  arrSum=recursiveSum(arr,0);
           int missingNum=actualSum-arrSum;
           System.out.print("The missing number is:"+ missingNum);
        }
        
    }
    

