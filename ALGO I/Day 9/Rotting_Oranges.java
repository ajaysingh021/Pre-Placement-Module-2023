class Solution {
    
    Queue<List<Integer>> queue = new LinkedList();
    int[][] g;
    int nonEmpty = 0;
    int n,m;
    int maxDays = 0;
    public int orangesRotting(int[][] grid) {
        g = grid;
        n = grid.length;
        m = grid[0].length;
        for(int i = 0; i < g.length; i++)
            for(int j = 0; j < g[0].length; j++){
                if(grid[i][j] != 0)
                    nonEmpty += 1;
                if(grid[i][j] == 2){
                    List<Integer> l = new ArrayList();
                    l.add(i);
                    l.add(j);
                    queue.add(l);
                    
                }
                    
            }
        int chg = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            //System.out.println(queue);
            for(int i = 0; i < len; i++){
                List<Integer> idx = queue.poll();
                int a = idx.get(0);
                int b = idx.get(1);
                g[a][b] = 2;
                if(a-1 >= 0 && g[a-1][b] == 1){
                    List<Integer> q = new ArrayList();
                    q.add(a-1);
                    q.add(b);
                    g[a-1][b] = 2;
                    queue.add(q);     
                    
                }
                if(b-1 >= 0 && g[a][b-1] == 1){
                    List<Integer> q = new ArrayList();
                    q.add(a);
                    q.add(b-1);
                    g[a][b-1] = 2;
                    queue.add(q);                        
                }
                if(a+1 < n && g[a+1][b] == 1){
                    List<Integer> q = new ArrayList();
                    q.add(a+1);
                    q.add(b);
                    g[a+1][b] = 2;
                    queue.add(q);                        
                }
                if(b+1 < m && g[a][b+1] == 1){
                    List<Integer> q = new ArrayList();
                    q.add(a);
                    q.add(b+1);
                    g[a][b+1] = 2;
                    queue.add(q);                        
                }
            }
            if(!queue.isEmpty())
                maxDays++;
        }
        
     for(int i = 0; i < g.length; i++)
            for(int j = 0; j < g[0].length; j++)
                if(grid[i][j] == 1)
                    return -1;
        
        return maxDays;
        
    }
}