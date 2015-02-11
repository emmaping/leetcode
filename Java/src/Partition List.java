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
  public ListNode partition(ListNode head, int x)
  {
    if (head == null)
      return null;
    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    dummy.next = head;
    ListNode end = head;
    int length = 0;
    while (end.next != null)
    {
      end = end.next;
      length++;
    }

    ListNode node = dummy;
    for (int i = 0; i <= length; i++)
    {
      if (node.next.val < x)
      {
        node = node.next;
      }
      else if (node.next != end)
      {
        ListNode temp = node.next.next;
        end.next = node.next;
        node.next.next = null;
        end = node.next;
        node.next = temp;
      }
    }
    return dummy.next;
  }
}
