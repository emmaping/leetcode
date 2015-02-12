# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def deleteDuplicates(self, head):
        if not head:
            return None
        dummy = ListNode(-1)
        dummy.next = head
        cur = dummy
        ret = dummy
        isDup = False
        
        if head.val == dummy.val:
            isDup = True

        while cur and cur.next and cur.next.next:
            if cur.val != cur.next.val and cur.next.val != cur.next.next.val:
                ret.next = cur.next
                ret = ret.next
            cur = cur.next
        
        if cur.next and cur.val != cur.next.val:
            ret.next = cur.next
            ret = ret.next
        elif cur.next and cur.val == cur.next.val:
            ret.next = cur.next.next
            ret = ret.next
        if isDup:
            return dummy
        else:
            return dummy.next
                
                
                
        