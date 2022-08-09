class Solution {
    public int maxArea(int[] height) {
       
        int left = 0;
        int maxArea = 0;
        int right = height.length - 1;
        while(left < right){
            int breath = right - left;
            int length = Math.min(height[left], height[right]);
            int area = length * breath;
            maxArea = Math.max(area, maxArea);
            if(height[left] < height[right])left++;
            else if(height[right] < height[left])right--;
            else{
                left++;
                right--;
            }
        }
        return maxArea;
    }
}