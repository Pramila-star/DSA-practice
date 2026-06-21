import java.util.ArrayList;
import java.util.List;

public class greatestNo_ofCandis {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      
         int max = candies[0];

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
}

public static void main(String args[]){
    int[] candies = {2,3,5,1,3};
    int extraCandies = 3;
    List<Boolean> ans = kidsWithCandies(candies, extraCandies);
    System.out.println(ans);
}
}
    

