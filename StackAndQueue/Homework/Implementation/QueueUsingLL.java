class QueueUsingLL {
    LinkedList queue;
    int size;
    int length;
    QueueUsingLL(int size) {
        queue = new LinkedList();
        this.size = size;
        length = 0;
    }
    boolean isFull() {
        return length == size;
    }
    boolean isEmpty() {
        return length == 0;
    }
    void enqueue(int val) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        queue.insertAtEnd(val);
        length++;
    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        length--;
        int res = queue.getData(queue.front);
        queue.deleteAtBeginning();
        return res;
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }
        return queue.getData(queue.front);
    }
}
