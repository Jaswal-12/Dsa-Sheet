import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        String one = "";
        String two = "";

        // reverse build
        while (temp1 != null) {
            one = temp1.val + one;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            two = temp2.val + two;
            temp2 = temp2.next;
        }

        BigInteger num1 = new BigInteger(one);
        BigInteger num2 = new BigInteger(two);

        BigInteger sum = num1.add(num2);

        String result = sum.toString();

        // build answer linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // reverse again for LL format
        for (int i = result.length() - 1; i >= 0; i--) {
            curr.next = new ListNode(result.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}
