# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param a ListNode
    # @return a ListNode
    def swapPairs(self, head):
        if not head:
            return None
        if not head.next:
            return head
        
        dummy = ListNode(0)
        dummy.next = head
        cur = dummy
        
        while cur.next and cur.next.next:
            cur.next = self.swap(cur.next, cur.next.next)
            cur = cur.next.next
                
        return dummy.next   
        
    def swap(self, node1, node2):
        node1.next = node2.next
        node2.next = node1
        return node2

        