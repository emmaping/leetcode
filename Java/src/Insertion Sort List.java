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
  public ListNode insertionSortList(ListNode head)
  {
    if (head == null)
      return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head;

    while (cur.next != null)
    {
      if (cur.next.val < cur.val)
      {
        ListNode pre = dummy;
        while (pre.next.val < cur.next.val)
        {
          pre = pre.next;
        }
        ListNode t = cur.next;
        cur.next = t.next;
        t.next = pre.next;
        pre.next = t;
      }
      else
      {
        cur = cur.next;
      }
    }
    return dummy.next;

  }
}
