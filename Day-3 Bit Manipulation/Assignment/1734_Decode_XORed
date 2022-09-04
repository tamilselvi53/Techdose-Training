class Solution {
    //T(n): O(n)
    //S(n): O(n)
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int total = 0, temp = 0;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n + 1; i++) {
            total ^= i;
        }
        for (int i = 1; i < n; i += 2) {
            total ^= encoded[i];
        }
        arr[0] = total;
        for (int i = 1; i <= n; i++) {
            arr[i] = (arr[i - 1] ^ encoded[i - 1]);
        }
        return arr;
    }
}
