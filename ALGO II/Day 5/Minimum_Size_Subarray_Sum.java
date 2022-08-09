class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int len =Integer.MAX_VALUE;
        int left =0;
        int right=0;
      
        while(right < nums.length){
            sum += nums[right];
            while(sum >= target){
                if(len > right -left+1){
                    len = right -left+1;
                }
                sum = sum-nums[left];
                left++;
            }
            right++;
        }
        if( len == Integer.MAX_VALUE) return 0;
        return len;
    }
}