public class Array{
    public static int SortedArray(int arr[], int key,int start,int end){
        if(start>end){
            return-1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
           return SortedArray(arr,key,start,mid-1);
        }else{
            return SortedArray(arr,key,mid+1,end);
        }
           
                
            }

            public static void main(String args[]){
                int arr[]={2,5,7,8,9};
                int key = 7;
                System.out.print(SortedArray(arr,key,0,arr.length-1));
                System.out.println();
            }
        }

