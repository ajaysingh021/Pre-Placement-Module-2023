class Solution {
    private static final int SIZE=26;
    public int firstUniqChar(String s) {
       int freq[]=new int[SIZE];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}