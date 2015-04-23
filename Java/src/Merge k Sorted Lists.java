import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution
{
  public ListNode mergeKLists(ListNode[] lists)
  {
    Queue<ListNode> queue = new PriorityQueue(new Comparator<ListNode>()
    {
      @Override
      public int compare(ListNode node1, ListNode node2)
      {
        return node1.val - node2.val;
      }
    });

    for (ListNode l : lists)
    {
      if (l != null)
        queue.add(l);
    }

    ListNode dummy = new ListNode(0);
    ListNode ret = dummy;
    while (!queue.isEmpty())
    {
      ret.next = queue.poll();
      ret = ret.next;
      if (ret.next != null)
      {
        queue.offer(ret.next);
      }
    }
    return dummy.next;

  }
}
