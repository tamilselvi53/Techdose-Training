class StackUsingLL {
    int size;
    LinkedList stack;
    int length;
    StackUsingLL(int size) {
        this.size = size;
        stack = new LinkedList();
        this.length = 0;
    }
    boolean isFull() {
        return length == size;
    }
    boolean isEmpty() {
        return length == 0;
    }
    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack.insertAtBeginning(val);
            length++;
        }
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int res = stack.getData(stack.top);
        stack.deleteAtBeginning();
        length--;
        return res;
    }
    int peek() {
        return stack.getData(stack.top);
    }
}
