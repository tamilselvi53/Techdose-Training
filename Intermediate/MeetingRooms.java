class Solution {
    //T(n): O(n log n)
    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;++i) {
            if(pq.isEmpty()) {
                pq.add(intervals[i][1]);
            } else {
                if(pq.peek()<=intervals[i][0]) {
                    pq.remove();
                    pq.add(intervals[i][1]);
                } else {
                    pq.add(intervals[i][1]);
                }
            }
        }
        return pq.size();
    }
}
