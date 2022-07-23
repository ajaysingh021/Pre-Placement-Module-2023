class Solution {
        public int rob(int[] nums) {
        
		if(nums.length == 1){
            return nums[0];
        }
		
		
        int[] arr = new int[nums.length];
        
		for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
		
        return Math.max(robHelper(0, nums, arr), robHelper(1, nums, arr));
		
    }
    
    private int robHelper(int index, int[] nums, int[] arr){
        
		if(index >= nums.length){
            return 0;
        } 
		
        if(arr[index] == -1){
           
			arr[index] = nums[index] + Math.max(robHelper(index + 2, nums, arr),
                                            robHelper(index + 3, nums, arr));
        } 
		
        return arr[index];
    }
}