class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
            while(q1.size()>1){
            q2.add(q1.remove());
        }
        int x = q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return x;
    }
    
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int y = q1.peek();
        q2.add(q1.remove());
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return y;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
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