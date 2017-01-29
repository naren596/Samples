
public class LinkedListCycle {	
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null || head.next.next == null) return false;
		ListNode fast = head.next;
		if(fast.val == head.val) return true;
		fast = fast.next;
		
		while(fast != null && fast.val != head.val) {
			head = head.next;
			fast = fast.next;
			if(fast == null) return false;
			if(fast.val == head.val) return true;
			fast = fast.next;
		}
		if(fast == null) return false;
		return true;
	}
}
