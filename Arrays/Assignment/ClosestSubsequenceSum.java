class Solution {
    int[] arr;
    public int minAbsDifference(int[] nums, int goal) {
        arr = nums;
        int n = nums.length;
        
        
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        
        generate(0,n/2,0, first); 
        generate(n/2, n , 0, second);
        
        
        Collections.sort(first);
        int ans = Integer.MAX_VALUE;
        
        
        for(int secondSetSum : second ) {
            int left = goal - secondSetSum; 
            
            if(first.get(0) > left) { 
                ans = (int)(Math.min(ans, Math.abs((first.get(0) + secondSetSum) - goal)));
                continue;
            }
            if(first.get(first.size() - 1) < left) { 
                ans = (int)(Math.min(ans, Math.abs((first.get(first.size() - 1) + secondSetSum) - goal)));
                continue;
            }
            int pos = Collections.binarySearch(first, left);
            if(pos >= 0) 
                return 0;
            else        
                pos = -1 * (pos + 1);
            int low = pos - 1;
            ans = (int)Math.min(ans, Math.abs(secondSetSum + first.get(low) - goal)); 
            ans = (int)Math.min(ans, Math.abs(secondSetSum + first.get(pos) - goal)); 
        }
        return ans;
    }

    /**
    * Generating all possible subset sums. 2 choices at each index,i -> pick vs do not pick 
    */
    public void generate(int i, int end, int sum, List<Integer> listOfSubsetSums) {
        if (i == end) {
            listOfSubsetSums.add(sum); //add
            return;
        }
        generate(i + 1, end, sum + arr[i], listOfSubsetSums);
        generate(i + 1, end, sum, listOfSubsetSums);
        
    } 
}
