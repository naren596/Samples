
public class AddTwoNumbers2 {
	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		int[] num1  ={7,2,4,3};
		ListNode l1 = ll1.insert(num1);
		LinkedList ll2 = new LinkedList();
		int[] num2 = {5,6,4};
		ListNode l2 = ll2.insert(num2);
		ListNode l3 = new AddTwoNumbers2().addTwoNumbers(l1, l2);
		ll2.print(l3);
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ReverseLinkedList rll = new ReverseLinkedList();
		l1 = rll.reverseList(l1);
		l2 = rll.reverseList(l2);
		ListNode temp = new ListNode(0), l3 = temp;
		int carry  = 0;
		
		while(l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			l1 = l1.next; 
			l2 = l2.next;
		}
		
		while(l1 !=null) {
			int sum = l1.val + carry;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			l1 = l1.next; 
		}
		
		while(l2 != null) {
			int sum = l2.val + carry;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			l2 = l2.next; 
		}
		if(carry != 0) temp.next = new ListNode(carry);
		
		l3 = rll.reverseList(l3.next);
        return l3;
    }
}
