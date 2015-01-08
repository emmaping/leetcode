# Definition for singly-linked list.
from buildTree import TreeNode
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param head, a ListNode
    # @param m, an integer
    # @param n, an integer
    # @return a ListNode
    def reverseBetween(self, head, m, n):
        t = n- m
        ret = head
        first = head
        second = head
        stack = []
        
        for i in range(m-1):
            first = first.next
            second = second.next
            
        for j in range(t):
            stack.append(first)
            first = first.next
        
        while stack:
            second.next = stack.pop()
            second = second.next
        
  #      second.next = first.next
        
        return ret
    
s = Solution()
a = TreeNode(3)
a.next = TreeNode(5)

print s.reverseBetween(a, 1, 2)