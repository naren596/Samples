
public class LinkedList {
	
	ListNode head;
	
	public ListNode insert(int[] ary) {
		if(ary.length == 0) return head;
		head = new ListNode(ary[0]);
		ListNode temp = head;
		for(int i = 1; i < ary.length; i++) {
			temp.next = new ListNode(ary[i]);
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public void print(ListNode head) {
		while(head != null) {
			System.out.print(head.val + "-->");
			head = head.next;
		}
		
		System.out.println();
	}
}
