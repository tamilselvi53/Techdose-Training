class Pair {
    char ch;
    int index;
    Pair(char ch, int index) {
        this.ch = ch;
        this.index = index;
    }
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek().ch == '(' && s.charAt(i) == ')') {
                st.pop();
            } else if (s.charAt(i) == '(' || s.charAt(i) == ')'){
                st.push(new Pair(s.charAt(i), i));
            }
        }
        StringBuffer sb = new StringBuffer(s);
        while (!st.isEmpty()) {
            int idx = st.pop().index;
            sb.deleteCharAt(idx);
        }
        return sb.toString();
    }
}
