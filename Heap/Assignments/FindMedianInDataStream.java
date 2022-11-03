class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    int minSize, maxSize;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
            maxSize++;
        } else {
            minHeap.add(num);
            minSize++;
        }
        if (minSize > maxSize + 1) {
            maxHeap.add(minHeap.remove());
            maxSize++;
            minSize--;
        }
        if (maxSize > minSize + 1) {
            minHeap.add(maxHeap.remove());
            maxSize--;
            minSize++;
        }
    }
    
    public double findMedian() {
        if (maxSize == minSize) {
            return (maxHeap.peek() + minHeap.peek()) /2.0;
        } else if (maxSize > minSize) {
            return maxHeap.peek();
        } else {
            return minHeap.peek();
        }
    }
}
