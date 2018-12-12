package leetcode.eighteen.dec.seven;
/**
 * 
 * @author 忆倾城
 *	将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 */
public class TwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode l3 = l;
        while(l1 != null && l2 != null) {
        	if (l1.val < l2.val) {
				l3.next = l1;
				l1 = l1.next;
			}else {
				l3.next = l2;
				l2 = l2.next;
			}
        	l3 = l3.next;
        }
        
        if (l1 != null) {
			l3.next = l1;
		}else{
            l3.next = l2;
        }
    	return l.next;
    }
}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		// TODO Auto-generated constructor stub
		val = x;
	}
}