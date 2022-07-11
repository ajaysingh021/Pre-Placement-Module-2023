class Solution {
    public void moveZeroes(int[] nums) {
        int count=nums.length-1;
        int[] n= new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                n[count]=nums[i];
                count--;
            }
            else{
             n[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=n[i];
        }
    }
}