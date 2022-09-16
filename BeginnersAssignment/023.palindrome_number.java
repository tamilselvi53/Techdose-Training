class Solution {
    public boolean isPalindrome(int x) {
        //T(n): O(log n)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse *= 10;
            reverse += (x % 10);
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}
