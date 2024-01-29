class MyQueue {


    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st1.isEmpty())return -1;
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int ele = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return ele;
    }
    
    public int peek() {
        if(st1.isEmpty())return -1;
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int ele = st2.pop();
        st2.push(ele);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return ele;
    }
    
    public boolean empty() {
        return (st1.isEmpty());
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
