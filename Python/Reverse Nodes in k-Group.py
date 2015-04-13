# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param k, an integer
    # @return a ListNode
    def reverseKGroup(self, head, k):
        if not head or not head.next or k <= 1 : return head
        dummy = ListNode(0)
        dummy.next = head
        ret = dummy
        cur = dummy
        pre = dummy
        num = 0
        while cur.next:
            num += 1
            cur = cur.next
        while num >= k:
            cur = pre.next;
            next = cur.next;
            for i in range(k-1):
                temp = next.next
                next.next = pre.next
                pre.next = next
                cur.next = temp
                next = temp
            pre = cur
            num = num - k

        return ret.next

        