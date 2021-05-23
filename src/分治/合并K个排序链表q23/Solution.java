package 分治.合并K个排序链表q23;
import java.util.PriorityQueue;

public class Solution {
    //使用优先队列来实现
    public ListNode mergeKLists1(ListNode[] lists){
        if(lists.length==0){
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        //声明一个从小到大排列的优先队列
        PriorityQueue<ListNode> q = new PriorityQueue<>((node1,node2)->{
            return node1.val- node2.val;
        });
        for (ListNode node : lists) {
            if(node!=null){
                q.add(node);
            }

        }
        while (!q.isEmpty()){
            tail.next = q.poll();
            tail = tail.next;
            if (tail.next!=null){
                q.add(tail.next);
            }
        }
        return dummy.next;

    }
    //使用分治合并
    public ListNode mergeKLists(ListNode[] lists){
        if (lists == null || lists.length == 0) return null;
        return merge(lists,0,lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if(left==right){
            return lists[left];
        }
        if (left>right){
            return null;
        }
        int mid = left+(right-left)>>1;
        return mergeTwoLists(merge(lists,left,mid),merge(lists,mid+1,right));
    }

    private ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head1!=null&&head2!=null){
            if (head1.val< head2.val){
                tail.next = head1;
                head1 = head1.next;
            }else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1!=null?head1:head2);
        return dummy.next;

    }

    public static void main(String[] args) {
        int[] list0 = new int[]{1,4,5};
        int[] list1 = new int[]{1,3,4};
        int[] list2 = new int[]{2,6};
        ListNode listNode0 = new ListNode(list0);
        ListNode listNode1 = new ListNode(list1);
        ListNode listNode2 = new ListNode(list2);
        ListNode[] listNodes = new ListNode[]{listNode0,listNode1,listNode2};
        System.out.println(listNode0);
        System.out.println(listNode1);
        System.out.println(listNode2);
        System.out.println(new Solution().mergeKLists(listNodes));
    }
}
