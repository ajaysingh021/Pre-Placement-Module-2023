class Solution {

public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>>res = new ArrayList<>();
    List<Integer>ans = new ArrayList<>();
    SubSet2(nums , res, ans , 0);
    
    return res;
}

public static void SubSet2(int [] nums ,  List<List<Integer>>res  , List<Integer>ans ,int i){
    

            res.add(new ArrayList<>(ans));
    
    
    for(int idx = i; idx<nums.length; idx++){
        if(idx>i && nums[idx-1] == nums[idx]){
            continue;
        }
        ans.add(nums[idx]);
        SubSet2(nums , res, ans, idx+1);
        ans.remove(ans.size()-1);
    }
}
}
