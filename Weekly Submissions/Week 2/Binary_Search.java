class Solution {
    public int search(int[] nums, int x) {
        int li=nums.length-1;
        
        int fi=0;
        while(fi<=li){
            int mi=(li+fi)/2;
            if(x<nums[mi]){
               li=mi-1; 
            }
            else if(x>nums[mi]){
                fi=mi+1;
            }
            else{
                return mi;
            }
        }
        return -1;
    }
}