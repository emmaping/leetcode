# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def addTwoNumbers(self, l1, l2):
        ret = ListNode(0)
        newlist = ret
        summary = 0
        while l1 or l2:
            summary //= 10
            if l1:
                summary += l1.val
                l1 = l1.next
            if l2:
                summary += l2.val
                l2 = l2.next
            
            newlist.next = ListNode(summary % 10)
            newlist = newlist.next
        if summary//10 == 1:
            newlist.next = ListNode(1)
        return ret.next
                
        
        