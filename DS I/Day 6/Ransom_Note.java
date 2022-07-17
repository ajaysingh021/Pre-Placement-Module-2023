class Solution
{
    public boolean canConstruct(String r, String m)
    {
        int fm[] = new int[26];
        
        for(int i=0; i<m.length(); ++i)
        {
            fm[m.charAt(i)-97]++;
        }
        
        for(int i=0; i<r.length(); ++i)
        {
            fm[r.charAt(i)-97]--;
            int t = fm[r.charAt(i)-97];
            
            if(t < 0)
                return false;
        }
        
        return true;
    }
}