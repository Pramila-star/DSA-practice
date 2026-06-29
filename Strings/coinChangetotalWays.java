public class coinChangetotalWays {
    public static int countWays(int coins[], int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 1;

        // outer loop for coins
        for (int coin : coins) { // iterate through each element in the coins array one by one
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];

            }
        }
        return dp[amount];
    }

    public static void main(String args[]) {
        int coins[] = { 1, 2, 5 };
        int amount = 20;
        System.out.println("Number of ways to make " + amount + "c:" + countWays(coins, amount));
    }
}
