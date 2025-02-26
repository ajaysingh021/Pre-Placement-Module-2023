class Solution {
      public int integerBreak(int n) {
        
        int[] dp = new int[n+1]; 
        
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        

        
        for(int i = 3; i < dp.length; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], dp[j] * (i-j));
                dp[i] = Math.max(dp[i], j * (i-j)); 
            }
        }
        
        return dp[n];
        
        
    }
}