class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum += num;
            int remaining = prefixSum - k;
            if (hashMap.containsKey(remaining))
                count += hashMap.get(remaining);
            hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}