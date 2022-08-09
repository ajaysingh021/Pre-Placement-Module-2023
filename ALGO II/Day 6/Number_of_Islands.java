class Solution {
    public int numIslands(char[][] grid) {
	int islands = 0; 

	for (int x = 0; x < grid.length; x++){
		for (int y = 0; y < grid[0].length; y++){
			if (grid[x][y] == '1'){
				deleteIsland(grid,x,y); 
				islands++;
			}
		}
	}

	return islands;
}

private void deleteIsland(char[][] grid, int x, int y){
	
	if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0')
		return;

	grid[x][y] = '0'; 

	
	deleteIsland(grid, x+1, y);
	deleteIsland(grid, x, y+1);
	deleteIsland(grid, x-1, y);
	deleteIsland(grid, x, y-1);
}
}