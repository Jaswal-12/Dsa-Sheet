public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int count1=0;
        int count2=0;

        ListNode temp1=headA;
        ListNode temp2=headB;


        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }


        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }

        int diff=Math.abs(count1-count2);

        temp1=headA;
        temp2=headB;
        if(count1>count2){
            while(diff-->0){
                temp1=temp1.next;
            }
        }else{
            while(diff-->0){
                temp2=temp2.next;
            }
        }


        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;


    }
}
