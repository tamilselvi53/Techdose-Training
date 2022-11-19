class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        dfs(ans, s, 0, 0, n);
        return ans;
    }
    public void dfs(List<String> ans, StringBuilder s, int open, int close, int max) {
        if (s.length() == 2 * max) {
            ans.add(s.toString());
            return;
        }
        
        if (open < max) {
            s.append("(");
            dfs(ans, s, open + 1, close, max);
            s.deleteCharAt(s.length() - 1);
        }
        if (close < open) {
            s.append(")");
            dfs(ans, s, open, close + 1, max);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
