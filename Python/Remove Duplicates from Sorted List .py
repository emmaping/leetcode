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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ret = head;
        if (head == null) return ret;
        while(ret.next != null){
            if (ret.val == ret.next.val) {
                ret.next = ret.next.next;
            }
            else{
                ret = ret.next;
            }
        }
        return head;
    }
}