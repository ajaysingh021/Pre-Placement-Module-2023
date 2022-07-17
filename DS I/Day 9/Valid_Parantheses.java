class Solution {
    public static boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      char last = '0';
      int i = 0;
      while (i < s.length()) {
        if (((s.charAt(i)) == ')' && last == '(') || ((s.charAt(i)) == '}' && last == '{')
                  || ((s.charAt(i)) == ']' && last == '[')) {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
        last = stack.isEmpty() ? '0' : stack.peek();
        i++;
      }
      return stack.isEmpty() ? true : false;
  }
}