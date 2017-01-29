public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ReverseLinkedList rLL = new ReverseLinkedList();
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		head  = rLL.reverseList(head);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public ListNode reverseList(ListNode head) {
		if(head == null) return head;
        ListNode prev = null, curr = head, next;
        while(curr != null) {
        	next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        }
        return prev;
    }
}
