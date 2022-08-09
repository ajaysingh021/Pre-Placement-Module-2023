class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        int n = isConnected.length;
        
        for(int row=0; row<n; row++){
           for(int col=0; col<n; col++) {
               if(isConnected[row][col] == 1) {
                   graph.putIfAbsent(row, new ArrayList<Integer>());
                   graph.putIfAbsent(col, new ArrayList<Integer>());
                   graph.get(row).add(col);
                   graph.get(col).add(row);
               }
           }
        }
        
        
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        
        for(int node=0; node < n; node++) {
            if(!visited.contains(node)){
                count++;
                DFS(graph, node, visited);
            }
        }
     
        return count;
    }
    
    private void DFS(Map<Integer, List<Integer>> graph, int currentNode, Set<Integer> visited) {
        visited.add(currentNode);
        
        for(int node: graph.get(currentNode)){
            if(!visited.contains(node)){
                DFS(graph, node, visited);
            }
        }
    }
}