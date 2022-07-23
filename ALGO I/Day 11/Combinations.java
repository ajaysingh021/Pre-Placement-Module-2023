class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1,n,k);
        return res;
    }
    public void backtrack(int start, int n, int k){
        if(k== track.size()) {
            res.add(new LinkedList<>(track));
        }
        for(int i = start; i <= n; i ++) {
            track.add(i);
            backtrack(i+1, n, k);
            track.removeLast();
        }
    }
}