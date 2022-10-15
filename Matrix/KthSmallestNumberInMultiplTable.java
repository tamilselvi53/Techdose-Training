class Solution {
    //Binary search
    public int findKthNumber(int m, int n, int k) {
        int l = 1, h = m * n, mid, capacity;
        while (l < h) {
            mid = l + (h - l) / 2;
            capacity = countMid(mid, m, n);
            if (capacity >= k) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public int countMid(int mid, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            int temp = Math.min(mid / i, n);
            count += temp;
        }
        return count;
    }
}
