class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
        
    }
    //T(n): O(n)
    public void push(int x) {
        q.offer(x);        
        int size = q.size();
        while (size > 1) {
            q.offer(q.poll());
            size--;
        }
    }
    //T(n): O(1)
    public int pop() {
        if (empty()) {
            return -1;
        }
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return (q.size() == 0);
    }
}
