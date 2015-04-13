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
       public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k <=1) return head;
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode cur = dummy;
        ListNode next = dummy;
        ListNode pre = dummy;
        ListNode ret = dummy;
        ListNode temp;
        
        int num = 0;
        while (cur.next != null) { 
            cur = cur.next;
            num++;
        }
        
        while (num >= k) { 
            cur = pre.next;
            next = cur.next;
            for (int i =0 ; i < k-1; i++){
                temp = next.next;
                next.next = pre.next;
                pre.next = next;
                cur.next = temp;
                next = temp;
            }
            pre = cur;
            num = num - k;
        }
        return ret.next;
    }
}
