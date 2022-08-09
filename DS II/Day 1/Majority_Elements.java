class Solution {
    public int majorityElement(int[] nums) {
       
      int n = nums.length;
      Arrays.sort(nums);

      for(int i = 0; i <= n/2; i++) {
          if(nums[i] == nums[n/2 + i]) return nums[i];
      }
         
      return nums[0];  
    }
}