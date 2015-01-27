class Solution:
    # @return a ListNode
    def removeNthFromEnd(self, head, n):
        if not head:
            return None
        fast = head
        slow = head
        for i in range(n):
            fast = fast.next
        if (fast == None):
            return slow.next;

        while fast.next != None:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return head