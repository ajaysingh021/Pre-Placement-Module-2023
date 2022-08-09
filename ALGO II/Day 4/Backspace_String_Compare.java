class Solution 
{
   public boolean backspaceCompare(String s, String t)
   {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        Character temp;
		
	
        for (int i = 0; i < s.length(); i++) 
		{
            temp = s.charAt(i);

			
            if (temp == '#') 
			{
                if(!st1.isEmpty())
                    st1.pop();
            } 
			else
			{
                st1.push(temp);
            }
        }

		//put all characters of string in other stack
        for (int j = 0; j < t.length(); j++) 
		{
            temp = t.charAt(j);

			//remove the previous character if found '#'
            if (temp == '#')
			{
                if(!st2.isEmpty())
                    st2.pop();
            } 
			else 
			{
                st2.push(temp);
            }
        }

        return isSameStack(st1, st2);
    }
    
    public boolean isSameStack(Stack<Character> stack1, Stack<Character> stack2)
    {
   
        boolean flag = true;

        if (stack1.size() != stack2.size())
        {
            flag = false;
            return flag;
        }

        while (stack1.empty() == false)
        {
            if (stack1.peek() == stack2.peek())
            {
                stack1.pop();
                stack2.pop();
            }
            else
            {
                flag = false;
                break;
            }
        }

        return flag;
    }
}