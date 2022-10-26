class MyQueue {
    private int top;
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s = new Stack<>();
    }
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
