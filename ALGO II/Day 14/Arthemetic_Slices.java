class Solution {
    public static int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] - nums[i + 1] != nums[i + 1] - nums[i + 2]) continue;
            int dif = nums[i] - nums[i + 1];
            ans++;

            for (int j = i + 3; j < nums.length; j++) {
                if (nums[j - 1] - nums[j] == dif) ans++;
                else break;
            }
        }

        return ans;
    }
}