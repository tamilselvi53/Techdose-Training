class RandomizedSet {
    List<Integer> nums;
    HashMap<Integer, Integer> map;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int i = map.get(val);
        if (i < nums.size() - 1) {
            int lastVal = nums.get(nums.size() - 1);
            nums.set(i, lastVal);
            map.put(lastVal, i);
        }
        map.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
