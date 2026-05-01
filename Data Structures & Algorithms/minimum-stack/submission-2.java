class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()) {
            minStack.push(val);
        } else if(!minStack.isEmpty() && (val <= minStack.peek())){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if( !stack.isEmpty()) {
            Integer pop = stack.pop();
            if(!minStack.isEmpty() && pop.equals(minStack.peek())){
                minStack.pop();
            }
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return 0;
    }
}
