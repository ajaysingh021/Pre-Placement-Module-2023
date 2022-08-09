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
    public int kthSmallest(TreeNode root, int k) 
    {
        List<Integer> list = inorder_traversal(root , new ArrayList<Integer>());
        
        return list.get(k-1);
        
        
    }
    
    private List<Integer> inorder_traversal(TreeNode root , List<Integer> list)
    {
        if(root == null)
            return list;
        
        inorder_traversal(root.left , list);
        list.add(root.val);
        inorder_traversal(root.right , list);
        
        return list;
    }
}