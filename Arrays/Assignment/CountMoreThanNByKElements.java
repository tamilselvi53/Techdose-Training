class Solution 
{
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int x = n / k;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }
         int count = 0;
        for (int key : mp.keySet()) {
            if (mp.get(key) > x) {
                count++;
            }
        }
        return count;
    }
}
