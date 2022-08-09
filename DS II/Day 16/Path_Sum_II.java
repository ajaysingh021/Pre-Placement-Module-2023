/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    if(root == null) {
      return new ArrayList<>();
    }
    List<List<Integer>> result = new ArrayList<>();
    recur(root, targetSum, result, new ArrayList<>());
    return result;
  }
  
  public void recur(TreeNode root, int targetSum, 
                    List<List<Integer>> result, List<Integer> list) {
    if(isLeaf(root) && targetSum - root.val == 0) {
      list.add(root.val);
      result.add(new ArrayList<>(list));
      list.remove(list.size() - 1);
      return;
    }
    
    if(root == null) {
      return;
    }
    
    list.add(root.val);
    
    recur(root.left, targetSum - root.val, result, list);  
    recur(root.right, targetSum - root.val, result, list);  
    
    list.remove(list.size() - 1);
  }
  
  private boolean isLeaf(TreeNode root) {
    return root != null && root.left == null && root.right == null;
  }
}