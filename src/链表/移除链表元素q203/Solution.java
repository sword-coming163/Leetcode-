package 链表.移除链表元素q203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        head.next=removeElements(head.next,val);
        if(head.val==val){
            return head.next;
        }else{
            return head;
        }
    }

}
