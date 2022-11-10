class Solution {
    //T(n): O(2 ^ N)
    Set<String> collection = new HashSet<>();
    List<String> ans = new ArrayList<>();
    public int invalidParanthesis(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        return count + stack.size();
    }
    public void generateParanthesis(String s, int n) {
        if (collection.contains(s)) {
            return;
        } else {
            collection.add(s);
        }
        if (n == 0) {
            if (invalidParanthesis(s) == 0) {
                ans.add(s);
            }            
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0, i) + s.substring(i + 1);
            generateParanthesis(str, n - 1);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        
        int n = invalidParanthesis(s);
        generateParanthesis(s, n);
        return ans;
    }
}
