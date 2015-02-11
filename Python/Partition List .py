# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param x, an integer
    # @return a ListNode
    def partition(self, head, x):
        if not head:
            return None
        dummy = ListNode(-2147483647)
        dummy.next = head
        end = head
        length = 1
        while end.next:
            end = end.next
            length = length + 1
        
        node = dummy
        for i in range(length):
            if node.next.val < x:
                node = node.next
            elif node.next != end:
                temp = node.next.next
                end.next = node.next
                node.next.next = None
                end = node.next
                node.next = temp
        return dummy.next
            
            
        