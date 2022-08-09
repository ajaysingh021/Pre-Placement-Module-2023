class Solution {
     public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k<=0) return 0;
            int n = nums.length;
            int prod =1;
            int res=0;

            int left =0;
            int right =0;
            while(left < n){
                while(right < n){
                    prod = prod*nums[right];
                    if(prod < k){
                        res++;
                    }else{
                        break;
                    }
                    right++;
                }
                prod=1;
                left++;
                right=left; 
            }
            return res;
        }
}