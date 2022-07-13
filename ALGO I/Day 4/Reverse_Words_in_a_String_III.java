class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            res=res+" "+reverse(str[i]);
        }
        res=res.substring(1);
        return res;
    }
    public static String reverse(String s1){
        char[] s= new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            s[i]=s1.charAt(i);
        }
        int li=0;
        int ri=s.length-1;
        while(li<=ri){
            char temp= s[li];
            s[li]=s[ri];
            s[ri]=temp;
            li++;
            ri--;
        }
        String res="";
        for(int i=0;i<s.length;i++){
            res+=s[i];
        }
        return res;
    }
}