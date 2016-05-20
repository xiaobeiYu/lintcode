c class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        if(stack2.empty()){
            transfer(stack1, stack2);
        }
        return stack2.pop();
    }

    public int top() {
        // write your code here
        if(stack2.empty()){
            transfer(stack1, stack2);
        }
        return stack2.peek();
    }
    
    public void transfer(Stack<Integer> stack1, Stack<Integer> stack2){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
    }
}
