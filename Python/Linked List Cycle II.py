# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    # @param head, a ListNode
    # @return a list node
    def detectCycle(self, head):
        if head == None: return None
        hare, turtle= head, head
        while hare != None:
            turtle = turtle.next
            hare = hare.next
            if hare == None: return None
            hare = hare.next
            if hare == turtle:
                turtle = head
                while turtle != hare:
                    hare = hare.next
                    turtle = turtle.next
                return hare
        return None