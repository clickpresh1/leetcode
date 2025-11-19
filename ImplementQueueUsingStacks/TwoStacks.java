class MyQueue {
    private Stack<Integer> s;
    private Stack<Integer> r;

    public MyQueue() {
        this.s = new Stack<>();
        this.r = new Stack<>();
    }
    
    public void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            while (!(s.isEmpty())) {
                r.push(s.pop());
            } 

            s.push(x);

            while(!(r.isEmpty())) {
                s.push(r.pop());
            } 
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
