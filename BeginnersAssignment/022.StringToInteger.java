class Solution {
    public int myAtoi(String str) {
        //T(n): O(n)
        int int_max = Integer.MAX_VALUE, int_min = Integer.MIN_VALUE;
        int sign = 1;
        int ans = 0;
        int i = 0, n = str.length();
        char[] s = str.toCharArray();
        if (n == 0) return 0;
        while (i < n && s[i] == ' ') {
            i++;
        }
      
        if (i< n && s[i] == '-') {
            sign = -1;
            i++;
        } else if (i < n && s[i] == '+') {
            sign = 1;
            i++;
        }
      
        while (i < n && s[i] >= '0' && s[i] <= '9') {
            if ((ans > int_max / 10) || ((ans == int_max / 10) && (s[i] - '0'> 7))) {
                if (sign == 1) return int_max;
                else return int_min;
            }
            ans *= 10;
            ans += (s[i] - '0');
            i++;
        }
        return sign * ans;
    }
}
