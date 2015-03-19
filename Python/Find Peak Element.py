class Solution:
    # @param num, a list of integer
    # @return an integer
    def findPeakElement(self, num):
        start = 0
        end = len(num) - 1
        
        while(start < end):
            mid1 = (start + end) / 2
            mid2 = mid1 + 1
            if num[mid1] < num[mid2]:
                start = mid2
            else:
                end = mid1
        return start
            
        