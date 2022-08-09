class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
           List<String> ls=new ArrayList<>();
    int i=0;
    int j=0;
    
    String str="";
    
    HashSet<String> arr=new HashSet<>();
    while(j<s.length())
    {
        str+=s.charAt(j);
        if(j-i<9);
        
        else
        {
            if(arr.contains(str) && !ls.contains(str))
                ls.add(str);
            else if(!arr.contains(str))
                arr.add(str);
            str=str.substring(1,str.length());
            i++;
        }
        j++;
    }
    
    
    return ls;

    }
}