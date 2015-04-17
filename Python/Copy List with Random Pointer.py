# Definition for singly-linked list with a random pointer.
# class RandomListNode:
#     def __init__(self, x):
#         self.label = x
#         self.next = None
#         self.random = None

class Solution:
    # @param head, a RandomListNode
    # @return a RandomListNode
    def copyRandomList(self, head):
        if not head: return None
        node = head
        while node:
            nodeIns = RandomListNode(node.label)
            temp = node.next
            node.next = nodeIns
            nodeIns.next = temp
            node = temp
        
        node = head
        while node:
            nodeIns = node.next
            if node.random:
                nodeIns.random = node.random.next
            node = node.next.next
        
        node = head
        nodeIns = head.next
        ret = head.next
        while node and nodeIns:
            node.next = node.next.next
            if not nodeIns.next:
                break
            nodeIns.next = nodeIns.next.next
            nodeIns = nodeIns.next
            node = node.next
        return ret
            