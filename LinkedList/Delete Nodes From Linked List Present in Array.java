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

//Final-Approach//
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        // STEP 1: nums ko HashSet me daal do
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        // STEP 2: dummy node (important)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        // STEP 3: traverse and delete
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = curr.next; // delete node
            } else {
                prev = curr; // move prev only if not deleted
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
