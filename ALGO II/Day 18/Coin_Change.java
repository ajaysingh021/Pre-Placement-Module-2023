class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int MAX = amount + 1;

       
        int[] dp_sum = new int[amount + 1];
        Arrays.fill(dp_sum, MAX);

        for (int n : coins)
            if (n <= amount) dp_sum[n] = 1;

      
        for (int coin : coins) {
            if (coin > amount) continue;
            for (int sum = 1; sum <= amount; sum++) {
                if(coin + sum <= amount && dp_sum[sum] != MAX) {
                    dp_sum[coin + sum] = Math.min(dp_sum[coin + sum], dp_sum[coin] + dp_sum[sum]);
                }
            }
        }
        return dp_sum[amount] == MAX ? -1 : dp_sum[amount];
    }
}