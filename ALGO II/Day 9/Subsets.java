class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set = new ArrayList<>(); 
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
          
        permute(new ArrayList<Integer>(), set, result);
        return result;
    }
    
    public void permute(List<Integer> first, List<Integer> rem, List<List<Integer>> result)
    {
        if(!result.contains(first))
            result.add(first);
        
        while(rem.size() > 0)
        {
            int val = rem.get(0);
            List<Integer> newFirst = new ArrayList<>(first);
            first.add(val);
            
            rem.remove(0);
            List<Integer> newRem = new ArrayList<>(rem);
            
            permute(newFirst, newRem, result);
        }
    }
}