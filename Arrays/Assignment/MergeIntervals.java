class Solution {
    public int[][] merge(int[][] intervals) {
        //T(n): O(n log n)
        int n = intervals.length;
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        ArrayList<int[]> ans = new ArrayList<int[]> ();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                ans.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[]{start, end});
		return ans.toArray(new int[ans.size()][]);
    }
}
