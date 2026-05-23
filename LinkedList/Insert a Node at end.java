
class Solution {
    public Node insertAtEnd(Node head, int x) {
           // code here
         Node temp=head;
         Node insert=new Node(x);
         
         
        
        if (head == null) {
            return insert;
        }
         
         while(temp!=null){
             if(temp.next==null){
                 temp.next=insert;
                 break;
             }
             
             temp=temp.next;
         }
         
         return head;
    }
}
