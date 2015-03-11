/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution
{
  public void reorderList(ListNode head)
  {
    if (head == null || head.next == null)
      return;
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
    }

    ListNode mid = slow.next;
    slow.next = null;

    // reverse mid list
    ListNode cur = mid;
    ListNode last = null;
    ListNode next;
    while (cur != null)
    {
      next = cur.next;
      cur.next = last;
      last = cur;
      cur = next;
    }
    ListNode merge = head;
    ListNode a;
    ListNode b;
    while (last != null)
    {
      a = merge.next;
      merge.next = last;
      b = last.next;
      last.next = a;
      merge = a;
      last = b;
    }
    return;
  }
}
