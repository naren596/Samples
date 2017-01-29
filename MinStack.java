import java.util.Stack;


public class MinStack {
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(512);
		minStack.push(-1024);
		minStack.push(-1024);
		minStack.push(512);
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
	}
	
	
	Stack<Integer> dataStack;
	Stack<Integer> minStack;
    public MinStack() {
    	 dataStack = new Stack<Integer>();
    	 minStack = new Stack<Integer>();
    }
    
    
    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty() || minStack.peek() >= x) {
        	minStack.push(x);
        }
    }
    
    public void pop() {
    	if(dataStack.peek().equals(minStack.peek())) minStack.pop();
        dataStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
