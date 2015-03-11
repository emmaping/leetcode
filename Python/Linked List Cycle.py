# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a boolean
    def hasCycle(self, head):
        fast = head
        slow = head
        ret = False
        while fast != None and fast.next != None :
             fast = fast.next.next
             slow = slow.next
             if fast is slow:
                 ret = True
                 break
        return ret