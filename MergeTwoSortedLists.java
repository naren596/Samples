
public class MergeTwoSortedLists {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] ary1 = {5,5,5};
		ListNode l1 = ll.insert(ary1);
		int[] ary2 = {1,1,2,4,5,5,6,7};
		ListNode l2 = ll.insert(ary2);
		ListNode head = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		ll.print(head);
	}
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		else if(l1 != null && l2 == null) return l1;
		else if(l2 != null && l1 == null) return l2;
		else{
			ListNode temp, head; 
			if(l1.val <= l2.val) {
				head = l1;
				while(l1.next != null && l1.next.val <= l2.val) l1 = l1.next;
				temp = l1.next;
				l1.next = l2;
				l2.next = mergeTwoLists(temp, l2.next);
			} else {
				head = l2;
				while(l2.next != null && l2.next.val <= l1.val) l2 = l2.next;
				temp = l2.next;
				l2.next = l1;
				l1.next = mergeTwoLists(temp, l1.next);
			}
			return head;
		}
	}
}
