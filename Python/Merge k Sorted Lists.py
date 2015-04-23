# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
from operator import attrgetter
class Solution:
    # @param a list of ListNode
    # @return a ListNode
    def mergeKLists(self, lists):
        sortedList = []
        for l in lists:
            cur = l
            while cur:
                sortedList.append(cur)
                cur = cur.next
        sortedList = sorted(sortedList, key = attrgetter('val'))
        
        for i in range(len(sortedList)-1):
            sortedList[i].next = sortedList[i+1]
        if len(sortedList) > 0:
            sortedList[len(sortedList)-1].next = None
        
        if sortedList:
            return sortedList[0]
        else:
            return None
            