class Solution:
    # @param head, a ListNode
    # @param k, an integer
    # @return a ListNode
    def rotateRight(self, head, k):
        if k == 0:
            return head
        if not head:
            return head

        rotate = head
        length = 1
        while rotate.next:
            rotate = rotate.next
            length += 1
        
        rotate.next = head
        k = k % length
        
        for i in range(length - k):
            rotate = rotate.next
        head = rotate.next
        rotate.next = None
        
        return head
        