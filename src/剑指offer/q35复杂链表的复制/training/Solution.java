package 剑指offer.q35复杂链表的复制.training;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
        Node curr = head;
        Map<Integer,Node> hashmap = new HashMap<>();
        while (curr!=null){
            //遍历节点并保存到HashMap中去
            hashmap.put(curr.val,curr.random);
            curr = curr.next;
        }
        Node dummy = new Node(0);
        Node temp = dummy.next;

        curr = head;
        while (curr!=null){
            temp.val = curr.val;
            temp.next = curr.next;
            temp.random = hashmap.get(temp.val);
            temp = temp.next;
        }
        return dummy.next;
    }
}
