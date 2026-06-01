class Solution {
    public Node insertInTail(Node head, int data) {

        if(head == null){
            return new Node(data);
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
        temp.next.prev = temp;

        return head;
    }
}
