package 剑指offer.q18删除链表的节点;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next!=null){
            if (curr.next.val == val){
                if (curr.next.next==null){
                    curr.next = null;
                    return dummy.next;
                }else {
                    curr.next = curr.next.next;
                }

            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{-3,5,-99};
        ListNode head = new ListNode(ints);
        System.out.println(head);
        System.out.println(new Solution().deleteNode(head,-99));
    }
}
