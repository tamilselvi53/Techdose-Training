class Solution {
    public int uniqueLetterString(String s) {
        //T(n): O(n)
        List<List<Integer>> lst = new ArrayList<List<Integer> >(26);
        for (int i = 0; i < 26; i++) {
            lst.add(new ArrayList<>());
            lst.get(i).add(-1);
        }
        int l = s.length();
        //Storing index of a character
        for (int i = 0; i < l; i++) {
            lst.get(s.charAt(i) - 'A').add(i);
        }
        for (int i = 0; i < 26; i++) {
            lst.get(i).add(l);
        }
        int total = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < lst.get(i).size() - 1; j++) {
                int temp = (lst.get(i).get(j) - lst.get(i).get(j - 1)) *  (lst.get(i).get(j + 1) - lst.get(i).get(j)); // leftrange * rightrange
                total += temp;
            }
        }
        return total;
    }
}
