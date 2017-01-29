import java.util.LinkedList;
import java.util.Queue;


public class ImplementStackUsingQueues {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	
	// Push element x onto stack.
    public void push(int x) {
    	if(!queue1.isEmpty()) queue1.add(x);
    	else if(!queue2.isEmpty()) queue2.add(x);
    	else queue1.add(x);
    } 

    // Removes the element on top of the stack.
    public void pop() {
        if(!queue1.isEmpty()) {
        	while(queue1.size() == 1) {
        		queue2.add(queue1.poll());
        	}
        	queue1.poll();
        	return;
        } 
        
        if(!queue2.isEmpty()) {
        	while(queue2.size() == 1) {
        		queue1.add(queue2.poll());
        	}
        	queue2.poll();
        }
    }
    

    // Get the top element.
    public int top() {
    	int val = -1;
    	if(!queue1.isEmpty()) {
        	while(queue1.size() == 1) {
        		queue2.add(queue1.poll());
        	}
        	val = queue1.peek();
        	queue2.add(queue1.poll());
        } 
        
        if(!queue2.isEmpty()) {
        	while(queue2.size() == 1) {
        		queue1.add(queue2.poll());
        	}
        	val = queue2.peek();
        	queue1.add(queue2.poll());
        	
        }
        return val;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
