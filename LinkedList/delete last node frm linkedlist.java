class Solution {
    public Node removeLastNode(Node head) {
        // Case 1: empty list
        if (head == null) return null;

        // Case 2: only one node
        if (head.next == null) return null;

        Node temp = head;

        // stop at second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // remove last node
        temp.next = null;

        return head;
    }
}
