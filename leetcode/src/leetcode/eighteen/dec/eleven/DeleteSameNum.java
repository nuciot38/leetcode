package leetcode.eighteen.dec.eleven;

public class DeleteSameNum {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head == null ||head.next == null) return head;
    	if (head.val != head.next.val) {
			head.next = deleteDuplicates(head.next);
			return head;
		}else {
			while((head = head.next).next != null && (head.val == head.next.val)){
				
			}
			return deleteDuplicates(head);
		}
    }
}


class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}