class Solution {
    public boolean searchMatrix(int[][] matrix, int data) {
        int row=0;
        int col=matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
	      if (matrix[row][col] == data) {
	        return true;
	      }
	      if (matrix[row][col] > data) {
	        col--;
	      } else {
	        row++;
	      }
	    }
        return false;
    }
}