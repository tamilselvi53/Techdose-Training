class StackUsingArray {
    int size;
    int[] stack;
    int top;
    StackUsingArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek() {
        return stack[top];
    }
}
