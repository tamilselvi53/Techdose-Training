class Solution {
    //T(n): 0(n)
    public void dfs(int node, int[][] graph, List<List<Integer>> ans, List<Integer> path) {
        if (node == graph.length - 1) {
            ans.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i: graph[node]) {
            //System.out.println(1);
            path.add(i);
            dfs(i, graph, ans, path);
            path.remove(path.size() - 1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(0, graph, ans, path);
        return ans;
    }
}
