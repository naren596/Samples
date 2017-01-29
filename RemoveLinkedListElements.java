
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode temp = head, prev = null;
		while(temp != null) {
			if(temp.val == val) {
				if(temp.next != null) {
					temp.val = temp.next.val;
					ListNode next = temp.next;
					temp.next = next.next;
					next = null;
				}else{
					if(prev == null) head = null;
					else prev.next = null;
					temp = null;
				}
			}else {
				prev = temp;
				temp = temp.next;
			}
		}
		return head;
    }
	
	
	public ListNode removeElements2(ListNode head, int val) {
		ListNode temp = head, prev = null;
		while(temp != null) {
			if(temp.val == val) {
				temp = temp.next;
				if(prev != null) {
					prev.next = temp;
				} else {
					head = head.next;
				}
			}else {
				prev = temp;
				temp = temp.next;
			}
		}
		return head;
    }
}
