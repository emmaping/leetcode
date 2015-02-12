/**
 * Definition for singly-linked list.
 * public class ListNode {
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
  public ListNode deleteDuplicates(ListNode head)
  {
    if (head == null)
      return head;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode cur = dummy;
    ListNode ret = dummy;
    boolean isDup = false;

    if (head.val == dummy.val)
      isDup = true;

    while (cur.next.next != null)
    {
      if (cur.val != cur.next.val && cur.next.val != cur.next.next.val)
      {
        ret.next = cur.next;
        ret = ret.next;
      }
      cur = cur.next;
    }

    if (cur.next != null && cur.val != cur.next.val)
    {
      ret.next = cur.next;
      ret = ret.next;
    }
    else if (cur.next != null && cur.val == cur.next.val)
    {
      ret.next = cur.next.next;
      ret = ret.next;
    }

    if (isDup)
    {
      return dummy;
    }
    else
    {
      return dummy.next;
    }
  }
}
