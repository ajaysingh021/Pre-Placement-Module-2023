class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        
        int[] count = new int[nums.length];
        
        int max = -1;
        
        for(int i =0; i<nums.length; i++){
            dp[i]=1;
            count[i]=1;
            for(int j = 0; j<i; j++){
            
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i] = dp[j] +1;
                    count[i] = count[j];
                }
                else if(nums[i]>nums[j]&& dp[j]+1==dp[i]){
                    count[i] += count[j];
                }
            }
            
            max = Math.max(max, dp[i]);
        }
        
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(dp[i]==max) res += count[i]; 
        }
        
        return res;
    }
}