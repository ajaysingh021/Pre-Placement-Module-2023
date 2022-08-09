class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		solve("",0,ans,2*n);
		return ans;
	}
	
	public void solve(String ds,int ind,List<String> ans,int n){
		
		if(ind==n){
			if(check(ds)) ans.add(ds); 
			return;
		}
		
		ds+="(";
		solve(ds,ind+1,ans,n);
		ds = ds.substring(0,ds.length()-1) + ")";
		solve(ds,ind+1,ans,n);
	}
	
	public boolean check(String ds){
		int check =0;
		for(char i: ds.toCharArray()){
			if(i=='(') check++;
			else check--;      
			if(check<0) return false;
		}
		return check==0;
	}
}