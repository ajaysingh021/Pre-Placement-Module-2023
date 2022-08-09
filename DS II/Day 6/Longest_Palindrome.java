class Solution {
    public int longestPalindrome(String s) 
	{
       int x=0,n=0,n_one=0,n_odd=0;
        for(int i=0;i<52;i++)
        {  if(i<26)
        {
            x=97+i;
        }
         else
             x=39+i;
            for(int j=0;j<s.length();j++)
            { if(x==(int)s.charAt(j))
                n++;
          }
         if(n==1)
         {
             n_one++;
         }
           if(n>1&&n%2!=0 )
               
                 n_odd++;
            n=0;
          }
        if(n_one==0&&n_odd==0)
            return s.length();
        else if(n_one==0)
            return s.length()-n_odd+1;
        else if(n_odd==0)
            return s.length()-n_one+1;
        else
            return s.length()+1-n_odd-n_one;
          }
}