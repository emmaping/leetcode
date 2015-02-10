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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        
        for (int i=0; i < m-1; i++){
            first = first.next;
        }
        
        ListNode second = first.next;
        ListNode temp;
        for (int j=0; j< n-m; j++){
            temp = first.next;
            first.next = second.next;
            second.next = second.next.next;
            first.next.next = temp;
        }
         return dummy.next;
        
    }
}