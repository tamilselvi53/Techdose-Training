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
        PriorityQueue<Character> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        for (char c: map.keySet()) {
            pq.add(c);
        }
        StringBuffer sb = new StringBuffer();
        while (!pq.isEmpty()) {
            char freq = pq.poll();
            for (int i = 0; i < map.get(freq); i++) {
                sb.append(freq);
            }
        }
        return sb.toString();
    }
}
