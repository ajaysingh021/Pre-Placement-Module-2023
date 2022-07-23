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
List res = new LinkedList<>();
public List postorderTraversal(TreeNode root) {
helper(root);
return res;

}

  private void helper(TreeNode root){
      if(root == null) return;
      helper(root.left);
      helper(root.right);
      res.add(root.val);
}
}