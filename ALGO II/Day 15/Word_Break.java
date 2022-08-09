class Solution {
    Set<String> dist;
    Map<String, Boolean> map;
    public boolean wordBreak(String s, List<String> wordDict) {
        dist = new HashSet<>(wordDict);
        map = new HashMap<>();
        return helper(s);
    }
    
    boolean helper(String s) {
        if(s.length()==0) {
		
             map.put(s,true);
            return true;
        }
        if(map.containsKey(s)) return map.get(s);
	
        for(String w: dist) {
            if(s.startsWith(w)) {
                String sub = s.substring(w.length());
                if(helper(sub)){ 
				
                    map.put(sub,true);
                    return true;
                }
            }
        }
		
         map.put(s,false);
        return false;
    }
}