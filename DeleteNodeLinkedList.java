
public class DeleteNodeLinkedList {
	public void deleteNode(ListNode node) {
		if(node == null) return;
		if(node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
			node.next.next = null;
		}
	}
}
