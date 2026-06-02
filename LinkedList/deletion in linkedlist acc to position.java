/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
          if (x == 1) {
            return head.next;
        }
        
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count+1==x){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
            count++;
        }
        
        return head;
        
    }
}
