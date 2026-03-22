class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

         ArrayList<Integer>l=new ArrayList<>();
         ListNode temp=head;

         while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
         }        

         ArrayList<Integer>new_ans=new ArrayList<>();
         for(int i=0;i<l.size();i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(l.get(i)==nums[j]){
                    found=true;
                    break;
                }
            }

            if(!found){
                new_ans.add(l.get(i));
            }
         }

         ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int val : new_ans){
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}
