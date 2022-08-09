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
    public void RightSideDFS(TreeNode root, int c,ArrayList<Integer> l)
    {
        if(root==null)
            return;
        if(l.size()==c)
        l.add(root.val);
        RightSideDFS(root.right,c+1,l);
        RightSideDFS(root.left,c+1,l);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList <Integer> l = new ArrayList<>();
        RightSideDFS(root,0,l);
        return l;
    }
}