class MinStack {
    Stack <Integer> stack;
    Stack <Integer> lowestValue;
    public MinStack() {
        stack = new Stack<>();
        lowestValue = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (!lowestValue.isEmpty()) {
            if (lowestValue.peek() >= val) {
                lowestValue.push(val);
            }
        }
        else {
            lowestValue.push(val);
        }
    }
    
    public void pop() {
        int recent = stack.pop();

        if (recent == lowestValue.peek()) {
            lowestValue.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return lowestValue.peek();
    }
}
