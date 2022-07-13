class Solution {
    public void reverseString(char[] s) {
        int li=0;
        int ri=s.length-1;
        while(li<=ri){
            char temp= s[li];
            s[li]=s[ri];
            s[ri]=temp;
            li++;
            ri--;
        }
    }
}