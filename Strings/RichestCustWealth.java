public class RichestCustWealth {
    public static void main(String args[]){
        int[][] arr = {
            {1, 2, 3},
            {3, 2 ,1},
            {4, 2, 1}
        };
        RichestCustWealth rc =new  RichestCustWealth();
        System.out.println(rc.maximumWealth(arr));

    }
    public int maximumWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int sum = 0;
            for(int anInt : ints){
                sum += anInt;

            }
           if (sum > ans){
            ans =sum;
           }
        }
        return ans;
    }
    
}
