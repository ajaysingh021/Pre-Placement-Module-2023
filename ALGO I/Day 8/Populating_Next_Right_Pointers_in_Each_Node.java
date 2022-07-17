/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
     if(root == null)
    {
        return root;
    }
    
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int size = queue.size();
        
        Node prev = null;
        Node currNode = null;
        for(int i=0;i<size;i++){
            currNode = queue.poll();
            if(i==0){
                prev = currNode;
            } else{
                prev.next = currNode;
                prev = currNode;
            }
            
            if(currNode.left != null ){
                queue.offer(currNode.left);
            }
            if(currNode.right != null){
                queue.offer(currNode.right);
            }
        }
        currNode.next=null;
    }
    
    return root;
    
    }
}