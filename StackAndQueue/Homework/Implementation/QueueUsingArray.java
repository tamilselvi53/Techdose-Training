class QueueUsingArray {
    int[] queue;
    int front;
    int rear;
    int size;
    int length;
    QueueUsingArray(int size) {
        queue = new int[size];
        this.front = 0;
        this.rear = -1;
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
        rear = (rear + 1) % size;
        queue[rear] = val;
        length++;
    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        length--;
        int res = queue[front];
        front = (front + 1) % size;
        return res;
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }
        return queue[front];
    }
}
