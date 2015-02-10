# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param m, an integer
    # @param n, an integer
    # @return a ListNode
    def reverseBetween(self, head, m, n):
        dummy = ListNode(0)
        dummy.next=  head 
        first = dummy
        for i in range(m-1):
            first = first.next 
        second = first.next 
        for j in range(n-m):
            temp = first.next 
            first.next = second.next
            second.next = second.next.next
            first.next.next = temp 
        return dummy.next  
    
            
        
            
        
        
        