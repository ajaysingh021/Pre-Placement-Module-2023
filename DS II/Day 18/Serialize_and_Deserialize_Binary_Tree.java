/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    String N = "N";
    
    public String serialize(TreeNode root) {
        if(root == null){
            return N;
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        
        return root.val + "," + left + "," + right ;
    }

    String[] arr;
    int index = 0;
    
    public TreeNode deserialize(String data) {
        arr = data.split(",");
        return dfs();
    }
    
    private TreeNode dfs(){
       
        if(arr[index].equals(N)){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index++]));
        root.left = dfs();
        root.right = dfs();
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));