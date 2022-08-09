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
    public TreeNode Bst(int[] arr, int si, int ei){
        if(si>ei)return null;
        int mid= (si+ei)/2;
        TreeNode root=  new TreeNode(arr[mid]);
        root.left=Bst(arr,si,mid-1);
        root.right=Bst(arr,mid+1,ei);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return Bst(nums,0,nums.length-1);
    }
}