class Solution {
    //T(n): O(n)
    public static boolean capacity(int mid, int[] weights, int days) {
        int n = weights.length;
        int total = 0;
        boolean isValid = true;
        int d = 1;
        for (int i = 0; i < n; i++) {
            if (weights[i] > mid) {
                isValid = false;
            } else if (total + weights[i] <= mid) {
                total += weights[i];
            } else {
                d++;
                total = weights[i];
            }
        }
        if (isValid == false) {
            return false;
        }
        return (days >= d);
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 1, r = 50000 * 500;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (capacity(mid, weights, days)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
