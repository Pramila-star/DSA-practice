import java.util.Arrays;

public class MergeTwoArray {
    public static void mergeSortedArray(int arr1[],int i, int arr2[], int j, int result[], int k){
        if(i==arr1.length && j==arr2.length){
            return;
        }
        if(i==arr1.length){
            result[k]= arr2[j];
            mergeSortedArray(arr1,i,arr2,j+1,result,k+1);
            return;
        }
        if(j==arr2.length){
            result[k]= arr1[i];
            mergeSortedArray(arr1,i+1, arr2, j, result, k+1);
            return;
        }
        if(arr1[i]<=arr2[j]){
            result[k]= arr1[i];
            mergeSortedArray(arr1,i+1,arr2,j,result,k+1);
        }else{
            result[k]=arr2[j];
            mergeSortedArray(arr1,i,arr2,j+1,result,k+1);
        }

        }
        public static void main(String args[]){
            int arr1[]={1,2,3,4,5};
            int arr2[]={1,6,7,8,9};
            int result[]=new int[arr1.length + arr2.length];
            mergeSortedArray(arr1,0,arr2,0,result,0);
            System.out.println("Merged Array: " + Arrays.toString(result));
        }
    }

