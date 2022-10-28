class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        //differnt bits are set to 1
        int res = x ^ y;
        // Counting setbits
        while (res > 0) {
            count += (res & 1);
            res >>= 1;
        }
        return count;
    }
}
