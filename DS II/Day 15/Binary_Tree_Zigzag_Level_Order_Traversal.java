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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        
        
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            level++;
            List<Integer> lst = new ArrayList<>();
            int sz = queue.size();
            
            for(int i =0; i < sz; i++) {
                TreeNode node = queue.remove();
                
                if(node.left!=null)
                    queue.add(node.left);
                
                if(node.right!= null)
                    queue.add(node.right);
                
                
                lst.add(node.val);
            }
            
            if(level % 2 == 0)
                Collections.reverse(lst);
            
            result.add(lst);
            
            
        }
        return result;
        
    }
}