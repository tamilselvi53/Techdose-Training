class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //After AND of r and r - 1 ==> r
        //If power of 2 exist, then result is 0;
        while (right > left) {
            right = (right & (right - 1));
            if (right == 0) {
                return 0;
            }
        }
        return left & right;
    }
}
