package 剑指offer.q35复杂链表的复制;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    public Node(int val) {
        this.val = val;
    }
}
