class Solution {
public int minDistance(String word1, String word2) {

    int dp[][] = new int[word1.length()][word2.length()];
    for(int row[] : dp) Arrays.fill(row, -1);
    
  
    
    int lcs = sub(word1.length()-1, word1, word2.length()-1, word2, dp);
    
   
    int del = word1.length() - lcs; 
    
   
    int ins = word2.length() - lcs;
    
   
    return del + ins;
}

public int sub(int i, String s, int j, String t, int dp[][]){
    
    if(i < 0 || j < 0) return 0; 
    
    if(dp[i][j] != -1) return dp[i][j];
    
    if(s.charAt(i) == t.charAt(j)){
        return dp[i][j] = 1 + sub(i-1, s, j-1, t, dp);
    }
  
    return dp[i][j] = Math.max(sub(i-1, s, j, t, dp) , sub(i, s, j-1, t, dp));
}
}