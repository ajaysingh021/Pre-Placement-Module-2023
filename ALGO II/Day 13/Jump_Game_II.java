class Solution {
  public int jump(int[] nums) {
        int jumpCount = 0,index = 0,ledder = 0;
        int len = nums.length;
        while(index<len) {
            if(index == (len-1)|| ledder>=(len-1)) return jumpCount;
            int currentLedder = ledder;
            while(index<=currentLedder) {
                if(index+nums[index]>ledder) {
                    ledder = index+nums[index];
                }
                index++;
            }
            
            jumpCount++;
        } 
        return jumpCount; 
    }
}