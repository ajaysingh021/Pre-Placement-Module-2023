class Solution {
    public boolean checkInclusion(String s, String p) {
        if(s.length()>p.length()){
            return false;
        }
        char sc[]=new char[256];
        char pc[]=new char[256];
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)]++;
            pc[p.charAt(i)]++;
        }
        for(int j=s.length();j<=p.length();j++){   
            if(Arrays.equals(sc,pc))return true;
            if(j>=p.length())break;
            pc[p.charAt(j)]++;
            pc[p.charAt(j-s.length())]--;
        }
        return false;
    }
}