public class immutableRangeSum {
      int[] prefix;
    public immutableRangeSum(int[] nums) {
        int n = nums.length;
        prefix = new int[n];

        prefix[0] = nums[0];
        for(int i =1; i< n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0)
           return prefix[right];
           return prefix[right] - prefix[left - 1];
    }

    public static void main(String args[]){
          int[] nums = {-2, 0, 3, -5, 2, -1};

        immutableRangeSum obj = new immutableRangeSum(nums);

        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
    }
