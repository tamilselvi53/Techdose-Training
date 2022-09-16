class Solution {
    //T(n): O(log n)
    public int mySqrt(int x) {
        int left = 1, right = Integer.MAX_VALUE;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid <= x / mid && mid + 1 > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
