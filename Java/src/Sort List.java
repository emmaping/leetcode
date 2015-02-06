/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode p = new ListNode(0);
        ListNode backup = p;
        
        while (fast != null && fast.next != null){
            p.next = slow;
            slow = slow.next;
            fast = fast.next.next;
            p = p.next;
        }
        p.next = null;
        
        ListNode right = sortList(slow);
        ListNode left = sortList(backup.next);
        return mergeList(left, right);
    }
    
    private ListNode mergeList(ListNode left, ListNode right){
        ListNode p = new ListNode(0);
        ListNode head = p;
        
        while(left != null && right != null){
            if (left.val <= right.val){
                p.next = left;
                left = left.next;
            }
            else{
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        if (left != null) p.next = left;
        if (right != null) p.next = right;
        return head.next;
    }
}