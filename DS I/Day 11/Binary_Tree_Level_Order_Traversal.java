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
    public List<List<Integer>> levelOrder(TreeNode root) {
            
           
            if(root==null){
             List<List<Integer>>null_ans=new ArrayList();
             return null_ans;
             }
            
            Queue<TreeNode>q=new LinkedList();
            List<List<Integer>>ans=new ArrayList();
            q.add(root);
            while(!q.isEmpty()){
                
                    int size=q.size();
                    List<Integer>temp=new ArrayList();
					
                    for(int i=0;i<size;i++){
                            TreeNode curr=q.peek();
                            if(curr.left!=null)q.add(curr.left);
                            if(curr.right!=null)q.add(curr.right);
							//removing the parent node
                            temp.add(q.remove().val);
                    }
					
                    ans.add(temp);
            
            }
            
            return ans ;
        
    }
}