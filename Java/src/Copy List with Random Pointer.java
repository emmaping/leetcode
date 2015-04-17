/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 * int label;
 * RandomListNode next, random;
 * RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution
{
  public RandomListNode copyRandomList(RandomListNode head)
  {
    if (head == null)
    {
      return null;
    }
    RandomListNode node = head;
    while (node != null)
    {
      RandomListNode nodeIns = new RandomListNode(node.label);
      RandomListNode tmp = node.next;
      node.next = nodeIns;
      nodeIns.next = tmp;
      node = tmp;
    }

    node = head;
    while (node != null)
    {
      RandomListNode nodeIns = node.next;
      if (node.random != null)
        nodeIns.random = node.random.next;
      node = node.next.next;
    }

    // detach list
    RandomListNode nodeIns = head.next;
    node = head;
    RandomListNode ret = head.next;

    while (nodeIns != null && node != null)
    {
      node.next = node.next.next;
      if (nodeIns.next == null)
      {
        break;
      }
      nodeIns.next = nodeIns.next.next;

      nodeIns = nodeIns.next;
      node = node.next;
    }
    return ret;

  }
}
