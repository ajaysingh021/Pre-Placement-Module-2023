class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
 
        int row=triangle.size();
        int col=triangle.get(row-1).size();
        
        int[][] dp=new int[row][col];
        
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        
        solUtil(triangle,0,0,dp);
        
        return dp[0][0];
    }
    
    public int solUtil(List<List<Integer>> triangle, int i,int j,int[][] dp){
        
        
        if(i>=triangle.size()) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int down=solUtil(triangle,i+1,j,dp);
        int right=solUtil(triangle,i+1,j+1,dp);

        return dp[i][j]=triangle.get(i).get(j) + Math.min(down,right);
    }
}