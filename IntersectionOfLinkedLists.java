
public class IntersectionOfLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int aLength = 0, bLength = 0;
		ListNode node = headA;
		while(node != null) {
			node = node.next;
			aLength++;
		}
		node = headB;
		while(node != null) {
			node = node.next;
			bLength++;
		}
		
		if(aLength == 0 || bLength == 0) return null;
		
		if(aLength > bLength) {
			while(aLength - bLength == 0){
				aLength--;
				headA = headA.next;
			}
		}else {
			while(bLength - aLength == 0){
				bLength--;
				headB = headB.next;
			}
		}
		
		while(headA != null && headB != null) {
			if(headA == headB) return headA;
			headA = headA.next;
			headB = headB.next;
		}
		
        return null;
    }
}
