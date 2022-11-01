class Solution {
    public int lengthOfLongestSubstring(String s) {
        //T(n): O(n)
        // S(n): O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = 0;
        int n = s.length();
        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            } 
            map.put(s.charAt(right), right);
            max = Math.max(right - left + 1, max);
            right++;
        }
        return max;
    }
