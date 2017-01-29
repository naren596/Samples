
public class RemoveDuplicatesFromSortedList {
	public static void main(String[] args) {
		int[] ary = {1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3};
		LinkedList ll = new LinkedList();
		ListNode head = ll.insert(ary);
		ll.print(head);
		head = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);
		ll.print(head);
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode slow = head, fast;
        while(slow != null) {
        	fast = slow;
        	while(fast.next != null && fast.val == fast.next.val) {
        		fast = fast.next;
        	}
        	if(slow != fast) {
        		slow.next = fast.next;
            	fast.next = null;
        	}
        	slow = slow.next;
        }
        
        return head;
    }
}
