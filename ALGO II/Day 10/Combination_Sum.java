class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        dfs(0, list, cur, candidates, target);
        return list;
    }
    
    private void dfs(int i, List<List<Integer>> list, List<Integer> cur, int[] candidates, int target) {
        
        if(target == 0) {
            list.add(new ArrayList(cur));
            return;
        }
        if(i >= candidates.length || target < 0) {
            return;
        }
        
        cur.add(candidates[i]);
        dfs(i, list, cur, candidates, target - candidates[i]);
        cur.remove(cur.get(cur.size() - 1));
        dfs(i + 1, list, cur, candidates, target);
    }
}