import java.util.ArrayList;
import java.util.List;

public class findDisappearNo {
     public static List<Integer> findDisappearedNumbers(int[] nums) {
         for (int num : nums) {
            int idx = Math.abs(num) - 1;
            nums[idx] = -Math.abs(nums[idx]);
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }

    public static void main(String args[]){
        int[] nums = {4,3,2,7,8,2,3,1};
         List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
