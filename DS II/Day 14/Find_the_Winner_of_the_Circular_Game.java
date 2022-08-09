class Solution {
   public int findTheWinner(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        k--;
        int index = 0;
        while (list.size() > 1) {
            index = (index + k) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}