/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode newList = ret;
        
        int summary = 0;
        while (l1 != null || l2 !=null){
            summary /= 10;
            if (l1 != null){
                summary += l1.val;
                l1 = l1.next;
            }
            if (l2 !=null){
                summary += l2.val;
                l2 = l2.next;
            }
            newList.next = new ListNode(summary % 10);
            newList = newList.next;
            if (summary/10 == 1){
                newList.next = new ListNode(1);
            }
        }
      return ret.next;  
    }
}