class Point{
    public int x;
    public int y;
    public int count;
    public Point(int _x,int _y,int _count){
        this.x=_x;
        this.y=_y;
        this.count=_count;
    }
}
class Solution {
     int [] dx= new int[]{1,1,1,-1,-1,-1,0,0};
    int [] dy= new int[]{1,0,-1,1,-1,0,1,-1};
    public int shortestPathBinaryMatrix(int[][] grid) {
   
        if(grid[0][0]==1) return -1;
        int row= grid.length;
        int col =grid[0].length;
        
        Queue<Point> q= new LinkedList<Point>();
        q.add(new Point(0,0,1));
        grid[0][0]=-1;
        
        while(!q.isEmpty()){
            Point p = q.poll();
            
            if(p.x==row-1&&p.y==col-1) return p.count;
            for(int i=0;i<8;i++){
                int x= p.x+dx[i];
                int y = p.y+dy[i];
                if(x>=0&&y>=0&&x<row&&y<col&&grid[x][y]==0){
                    q.add(new Point(x,y,p.count+1));
                    grid[x][y]=-1;
                }
            }
        }
        return -1;
    }
}