class Solution {
     public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] lis = new int[length];
        lis[length-1] = 1;
        int max = 1;
        for(int i = length - 2; i > -1; i--) {
            lis[i] = 1;
            for (int j = i+1; j < length; j++) {
                if (nums[i] < nums[j]) {
                    lis[i] = Math.max(lis[i], Math.max(1, 1 + lis[j]));
                }
            }
            max = Math.max(max, lis[i]);
        }
        return max;
    }
}