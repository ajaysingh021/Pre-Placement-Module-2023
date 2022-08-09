class Solution {
    public int findPeakElement(int[] nums) {
        return bs(nums,0,nums.length-1);
    }
    int bs(int[] arr,int lo,int hi) {
        if(lo>=hi)
            return lo;
        int mi = (lo+hi)/2;
        
        if(arr[mi]<arr[mi+1])
            return bs(arr,mi+1,hi);
        return bs(arr,lo,mi);
    }
}