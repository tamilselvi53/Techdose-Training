class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int nLen = nums.length;
        int shortest = nLen + 1;
        
        long[] prefixSum = new long[nLen + 1];
        for(int i=0; i < nLen; i++)
            prefixSum[i+1] = prefixSum[i] + nums[i];
        
        Deque<Integer> startIdxs = new ArrayDeque<>();
        
        for(int i=0; i < nLen + 1; i++){
            while(!startIdxs.isEmpty() && prefixSum[i] - prefixSum[startIdxs.peek()] >= k)
                shortest = Math.min(shortest, i - startIdxs.poll());
            
            while(!startIdxs.isEmpty() && prefixSum[i] <= prefixSum[startIdxs.peekLast()])
                startIdxs.pollLast();
            
            startIdxs.add(i);
        }
        
        return shortest <= nLen ? shortest : -1;
    }
}
