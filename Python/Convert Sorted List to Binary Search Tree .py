# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a list node
    # @return a tree node
    def sortedListToBST(self, head):
        if not head:
            return None
    
        return self.generate(head, None)
            
    def generate(self, head, tail):
        if not head:
            return None
        
        first = head
        second = head
        
        while second != tail and second.next != tail:
            first = first.next
            second = second.next.next
        
        node = TreeNode(first.val)
        node.left = self.generate( None if head == first else head, first)
        node.right = self.generate( None if first.next == tail else first.next, tail)
        return node
        
        
        
        