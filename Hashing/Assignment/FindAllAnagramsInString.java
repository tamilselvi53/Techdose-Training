class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] s_map = new int[26];
        int[] p_map = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        if (p.length() > s.length()) {
            return list;
        }
        for (int i = 0; i < p.length(); i++) {
            s_map[s.charAt(i) - 'a']++;
            p_map[p.charAt(i) - 'a']++;
        }
        if (matches(s_map, p_map)) {
            list.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            s_map[s.charAt(i) - 'a']--;
            s_map[s.charAt(i + p.length()) - 'a']++;
            if (matches(s_map, p_map)) {
                list.add(i + 1);
            }
        }
        return list;
    }
    public boolean matches(int[] s_map, int[] p_map) {
        for (int i = 0; i < 26; i++) {
            if (s_map[i] != p_map[i]) {
                return false;
            }
        }
        return true;
    }
}
