class Solution {
    public class Pair implements Comparable<Pair>{
        int st;
        int ed;
        Pair(int st,int ed){
            this.st = st;
            this.ed = ed;
    
        }
       
        
        public int compareTo(Pair other){
            if(this.st!=other.st)
                return this.st-other.st;
            else
                return this.ed - other.ed;
        }
    }
    public int[][] merge(int[][] arr) {
        
        Pair[] pair = new Pair[arr.length];
        
        for(int i=0;i<arr.length;i++){
            pair[i] = new Pair(arr[i][0],arr[i][1]);
        }
        
        Arrays.sort(pair);
        
        Stack<Pair> st = new Stack<Pair>();
        
        for(int i=0;i<pair.length;i++){
            if(i==0){
                st.push(pair[i]);
            }else{
                Pair top = st.peek();
                if(pair[i].st>top.ed){
                    st.push(pair[i]);
                }else{
                    top.ed = Math.max(top.ed,pair[i].ed);
                }
            }
        }
        int n = st.size();
        int[][] result = new int[n][2];
        
        int j=n-1;
        while(!st.isEmpty() && j>=0){
            Pair top = st.peek();
            result[j][0] = top.st;
            result[j][1] = top.ed;
            j--;
            st.pop();
        } 
        
        return result;
    }
}