
public class RemoveNthNodeFromEnd {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] ary = {1,2,3};
		ListNode head = ll.insert(ary);
		head = new RemoveNthNodeFromEnd().removeNthFromEnd(head, 2);
		ll.print(head);
	}
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null, fast = head, slow = head;
        while(n > 0) {
        	fast = fast.next;
        	n--;
        }
        
        while(fast != null) {
        	fast = fast.next;
        	prev = slow;
        	slow = slow.next;
        }
        if(prev == null) return head.next;
    	fast = slow.next;
    	prev.next = fast;
    	slow = null;
        return  head;
    }
}
