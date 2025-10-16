class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char t : s.toCharArray()) { 
            if (t == '(')
                stack.push(')');
            else if (t == '{') 
                stack.push('}');
            else if (t == '[') 
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != t)
                return false;
        }
        return stack.isEmpty();
    }
}