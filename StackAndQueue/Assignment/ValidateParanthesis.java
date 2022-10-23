class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (stack.empty()) {
                return false;
            } else if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
            } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
            } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
