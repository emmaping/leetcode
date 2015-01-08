class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
# @param head, a ListNode
# @param x, an integer
# @return a ListNode
    def partition(self, head, x):
        if head==None:
            return
        vhead=ListNode(0)
        vhead.next=head
        end=head
        length=1
        while end.next!=None:
            end=end.next
            length+=1
        node=vhead
        for i in range(length):
            if node.next.val<x:
                node=node.next
            elif node.next!=end:
                temp=node.next.next
                end.next=node.next
                node.next.next=None
                end=node.next
                node.next=temp
    
        return vhead.next
a = ListNode(1)
s = Solution()
ret = s.partition(a, 0)            
print ret.val 