class Solution {
    public void sortColors(int[] nums) {
        int count=0,count1=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0)
                count+=1;
            if(nums[i]==1)
                count1+=1;
        }
            for(int i=0;i<nums.length;i++){
                if(i<count)
                    nums[i]=0;
                else if(i<count1+count)
                    nums[i]=1;
                else 
                    nums[i]=2;
            }
    }
}