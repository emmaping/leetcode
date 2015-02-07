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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ret = dummy;
        while(ret.next != null && ret.next.next != null){
            ret.next = swap(ret.next, ret.next.next);
            ret = ret.next.next;
        }
        return dummy.next;
    }
        
    public ListNode swap(ListNode node1, ListNode node2){
        node1.next = node2.next;
        node2.next = node1;
        return node2;
    }
}