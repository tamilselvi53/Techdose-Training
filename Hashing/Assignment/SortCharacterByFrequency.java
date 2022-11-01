class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Character>[] buckets = new List[s.length()+1];
        for (char c: map.keySet()) {
            int pos = map.get(c);
            if (buckets[pos] == null) {
                buckets[pos] = new ArrayList<>();
            }
            buckets[pos].add(c);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = s.length(); i >= 1; i--) {
            if (buckets[i] != null) {
                for (char c: buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
