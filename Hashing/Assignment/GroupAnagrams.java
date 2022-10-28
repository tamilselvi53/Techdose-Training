class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //T(n): O(n)
        //S(n): O(n)
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] freq = new char[26];
            for (char ch: strs[i].toCharArray()) {
                freq[ch - 'a']++;
            }
            String keyStr = String.valueOf(freq);
            if (!(map.containsKey(keyStr))) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
