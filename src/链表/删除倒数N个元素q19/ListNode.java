package 链表.delletq79;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }
    public void printListNode(ListNode head){
        ListNode temp = head;
        if(head==null){
            System.out.println(head);
        }
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
