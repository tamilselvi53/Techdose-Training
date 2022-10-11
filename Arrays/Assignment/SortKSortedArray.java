class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        //T(n): O(k) + O(n - k) * O(log k)
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0) {
          return res;
        }
        // min heap
        PriorityQueue<Integer> priorityQueue
            = new PriorityQueue<>();
            
        // if there are less than k + 1 elements present in the array
        int minCount = Math.min(arr.length, k + 1);
        // add first k + 1 items to the min heap
        for (int i = 0; i < minCount; i++) {
            priorityQueue.add(arr[i]);
        }
 
        for (int i = k + 1; i < num; i++) {
            res.add(priorityQueue.peek());
            priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }
        
        //To store remaining elements
        Iterator<Integer> itr = priorityQueue.iterator();
 
        while (itr.hasNext()) {
            res.add(priorityQueue.peek());
            priorityQueue.poll();
        }
        return res;
    }
}
