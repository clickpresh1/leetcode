class MyStack {
    private Queue<Integer> q;
    private Queue<Integer> p;

    public MyStack() {
        this.q = new LinkedList<>();
        this.p = new LinkedList<>();
    }
    
    public void push(int x) {
        if (q.isEmpty()) {
            q.add(x);
        } else {
            while (!(q.isEmpty())) {
                p.add(q.poll());
            } 

            q.add(x);

            while (!(p.isEmpty())) {
                q.add(p.poll());
            }
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
