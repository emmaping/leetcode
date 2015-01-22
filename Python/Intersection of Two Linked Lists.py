class Solution:
    # @param two ListNodes
    # @return the intersected ListNode
    def getIntersectionNode(self, headA, headB):
        nodeA = headA
        nodeB = headB

        while nodeA != nodeB:
            try:
                nodeA = nodeA.next
            except:
                nodeA = headB

            try:
                nodeB = nodeB.next
            except:
                nodeB = headA
        return nodeA