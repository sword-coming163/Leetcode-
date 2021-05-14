package 递归.合并两个有序链表q21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
}
