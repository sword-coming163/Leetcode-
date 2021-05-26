package 剑指offer.q22链表中倒数第K个节点;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //使用快慢指针完成
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode second = dummy.next;
        ListNode first = dummy.next;
        while (second!=null){
            second =second.next;
            k--;
            if (k==0){
                break;
            }
        }
        while (second!=null){
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.println(new Solution().getKthFromEnd(head,2));
    }
}
