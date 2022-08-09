class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(
                robNow(Arrays.copyOfRange(nums,1,nums.length)),
                robNow(Arrays.copyOfRange(nums,0,nums.length-1))
            );
    }
    
    public int robNow(int[] nums){
        int robPrev=0, robPrevPrev=0;
        for(int i: nums){
            int temp = Math.max(robPrevPrev+i, robPrev);
            robPrevPrev=robPrev;
            robPrev=temp;
        } return robPrev;
    }
}