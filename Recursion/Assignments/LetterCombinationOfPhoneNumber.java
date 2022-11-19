class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int ch = 96;
        if (digits.length() == 0) {
            return list;
        }
        for (int i = 2; i <= 9; i++) {
            List<Character> temp = new ArrayList<>();
            temp.add((char)++ch);
            temp.add((char)++ch);
            temp.add((char)++ch);
            if (i == 7 || i == 9) {
                temp.add((char)++ch);
            }
            map.put(i, temp);
        }
        int len = digits.length();
        recursive(list, map, digits, "", 0, len);
        return list;
    }
    public void recursive(List<String> list, Map<Integer, List<Character>> map, String digits, String curr, int index, int len) {
        if (curr.length() ==  len) {
            list.add(curr);
            return;
        }
        int key = (int)digits.charAt(index);
        int size = (map.get(key - 48)).size();
        for (int i = 0; i < size; i++) {
            char ch = (map.get(key - 48)).get(i);
            recursive(list, map, digits, curr + ch, index + 1, len);
            
        }
    }
}
