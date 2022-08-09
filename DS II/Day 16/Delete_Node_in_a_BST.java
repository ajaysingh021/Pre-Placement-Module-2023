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
    public TreeNode deleteNode(TreeNode root, int key)
    {
        if(root == null)
            return null;
        
        if(root.val > key)
            root.left = deleteNode(root.left , key);
        
        else if(root.val < key)
            root.right = deleteNode(root.right , key);
        
        else
        {
            
        if(root.right == null && root.left == null)
        {
            root = null;
            return root;
        }
        else if (root.left!= null && root.right == null)
        {
            root=root.left;
            return root;
        }
        else if (root.right != null && root.left == null)
        {
            root = root.right;
            return root;
        }
            
          TreeNode right_subtree = root.right;
            TreeNode temp = find_leftmost_node(root.right);
            
            int t = root.val;
            root.val = temp.val;
            temp.val=t;
            
            root.right = deleteNode(root.right , temp.val);
            return root;
        }
        return root;
    }
    
    private TreeNode find_leftmost_node(TreeNode current_node)
    {
        while(current_node.left != null)
        {
            current_node = current_node.left;
        }
        
        return current_node;
    }
}