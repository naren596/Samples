import java.util.Stack;


public class ImplementQueueUsingStack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	int size = 0;
	
	public void push(int x) {
        if(stack1.isEmpty()) {
        	if(!stack2.isEmpty()){
        		while(!stack2.isEmpty()) {
        			stack1.push(stack2.pop());
        		}
        	}
        }
        stack1.push(x);
        size++;
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack1.isEmpty()) {
        	while(!stack1.isEmpty()) {
            	stack2.push(stack1.pop());
            }
        }
        stack2.pop();
        size--;
    }

    // Get the front element.
    public int peek() {
    	if(!stack1.isEmpty()) {
        	while(!stack1.isEmpty()) {
            	stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return size == 0;
    }
}
