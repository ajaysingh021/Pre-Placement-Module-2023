class Solution {
    public int findMin(int[] nums) {
        int index = findPivot(nums);
        if(index == nums.length - 1){
            return nums[0];
        }else{
            return nums[index + 1];
        }
    }
    
    public int findPivot(int[] nums){
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if( mid < hi && nums[mid] > nums[mid + 1]){
                return mid;
            }else if( mid > lo && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }else if(nums[lo] >= nums[mid]){
                hi = mid  - 1;
            }else{
                lo = mid + 1;
            }
        }
        return -1;
    }
}