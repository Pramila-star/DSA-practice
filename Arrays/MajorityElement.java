package Arrays;

public class MajorityElement {
    public static int FindMajElm(int[] nums){
        int maj =0;
        int vote = 0;
        for(int num : nums){
            if(vote == 0){
                maj = num;
            }
            if ( num == maj){
                vote++;
            } else {
                vote--;
            }
        }
        return maj;
    }

    public static void main(String args[]){
        int[] nums = {3, 3, 4, 1, 4, 3, 3};
        int result = FindMajElm(nums);
        System.out.println("Majority element is: " + result);
    }
}