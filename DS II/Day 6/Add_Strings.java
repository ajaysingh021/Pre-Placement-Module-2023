class Solution {
    public String addStrings(String num1, String num2) {
        
        String res = "";
        int len1 = num1.length();
        int len2 = num2.length();
        int carry =0;
        
        int i=len1-1;
        int j=len2-1;
        
        while( i>=0 || j>=0 || carry!=0){
            
            int var1=0;
            int var2=0;
            if(i>=0){
               var1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
                i--;
            }
            
            if(j>=0){
                var2 =Integer.parseInt(String.valueOf(num2.charAt(j)));
                j--;
            }
            
            int sum = var1 + var2 + carry;
            carry = sum/10;
            sum = sum%10;
            
            res+= String.valueOf(sum);
        }
        
        
        StringBuilder s = new StringBuilder(res);
        s =s.reverse();
        res = s.toString();
       
        return res;
    }
    
}