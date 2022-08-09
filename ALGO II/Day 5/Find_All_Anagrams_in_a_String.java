class Solution {
   public List<Integer> findAnagrams(String s, String p) {
                
        List<Integer> result= new ArrayList<>();
        if(s.length() < p.length()){
            return result;
        }
        int[] pArr= new int[26];
        int[] sArr= new int[26];
        
        for(int i=0; i< p.length() ; i++){
            pArr[p.charAt(i)- 'a'] = pArr[p.charAt(i)- 'a']+1;
            sArr[s.charAt(i)-'a'] = sArr[s.charAt(i)- 'a'] +1 ;
        }
        int len= p.length();
        char prev = s.charAt(0);
        for(int i=0; i <= s.length()-len ; i++){
            if(i==0){
                if(Arrays.equals(pArr,sArr)){
                    result.add(0);
                    prev = s.charAt(0);
                }
            }else{
                sArr[prev-'a'] = sArr[prev- 'a'] - 1 ;
                sArr[s.charAt(i+len-1)-'a'] = sArr[s.charAt(i+len-1)- 'a'] + 1 ;
                if(Arrays.equals(pArr,sArr)){
                    result.add(i);
                }
                prev = s.charAt(i);
            }
        }
        return result;
        
    }
}