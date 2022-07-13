class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        int row = 1;
        while(row <= numRows) {
            if(row == 1) {
                List<Integer> a = new LinkedList<>();
                a.add(1);
                ans.add(a);
                row++;
            }
            else {
                int n = ans.get(ans.size() - 1).size();
                List<Integer> a = new LinkedList<>();
                a.add(1);
                for(int i = 0; i <= n - 2; i++) {
                    int sum = ans.get(ans.size() - 1).get(i) + ans.get(ans.size() - 1).get(i + 1);
                    a.add(sum);
                }
                a.add(1);
                ans.add(a);
                row++;
            
            }
        }
        return ans;
    }
}