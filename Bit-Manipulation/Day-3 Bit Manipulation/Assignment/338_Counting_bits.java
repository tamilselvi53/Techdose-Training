class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        //Count of setbit for even num = count of even num / 2
        //if we right shift, values doesnt change for even, but changes for odd
        for (int i = 1; i <= n; i++) {
            ans[i] = (ans[i >> 1]) + (i & 1);
        }
        return ans;
    }
}
