# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def sortList(self, head):
        if head is None or head.next is None:
            return head
        mid = (head.val + head.next.val) / 2
        if head.val > head.next.val:
            lhead, rhead = head.next, head
        else:
            lhead, rhead = head, head.next
        lit, rit = lhead, rhead
        it = head.next.next
        lcount, rcount = 0, 0
        while it is not None:
            if it.val > mid:
                rit.next = it
                rit = it
                rcount += 1
            elif it.val < mid:
                lit.next = it
                lit = it
                lcount += 1
            else:
                if lcount < rcount:
                    lit.next = it
                    lit = it
                    lcount += 1
                else:
                    rit.next = it
                    rit = it
                    rcount += 1
            it = it.next
        lit.next, rit.next = None, None
        lhead = self.sortList(lhead)
        rhead = self.sortList(rhead)
        it = lhead
        while it.next is not None:
            it = it.next
        it.next = rhead
        return lhead
        