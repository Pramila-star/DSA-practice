package Arrays;

import java.util.Arrays;

public class MaxAvgSubarray {
    public static int[] maxSubarray(int[] nums, int k){
        int sum = 0;
        int maxSum = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i< nums.length; i++){
            sum += nums[i];

            if(i >= k - 1){
                if(sum > maxSum){
                    maxSum = sum;
                    start = i - k + 1;
                }

                sum -= nums[i - k + 1];
            }
        }
        return Arrays.copyOfRange(nums, start, start + k);
    }

    public static void main(String args[]){
        int[] nums =  {1, 12, -5, -6, 50, 3};
        int[] res = maxSubarray(nums, 4);

        System.out.println(Arrays.toString(res));
    }
}
