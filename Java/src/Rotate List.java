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
  public ListNode rotateRight(ListNode head, int n)
  {
    if (n == 0 || head == null)
      return head;
    ListNode rotate = head;
    int length = 1;

    while (rotate.next != null)
    {
      rotate = rotate.next;
      length++;
    }

    rotate.next = head;
    int k = n % length;

    for (int i = 0; i < length - k; i++)
      rotate = rotate.next;
    head = rotate.next;
    rotate.next = null;
    return head;

  }
}
