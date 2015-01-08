class Solution:
    # @param A, a list of integers
    # @param target, an integer to be inserted
    # @return integer
    def searchInsert(self, A, target):
        
        ret = self.compareMedian( A, target, 0, len(A)-1)
        return ret
    
    def compareMedian(self, A, target, start, end):
    
        median = (start + end) //2
        if start == median :
            if target > A[end]:
                return end+1
            elif target < A[start]:
                return start
            elif target == A[median]:
                return median
            
            else:
                return end
        if target == A[median]:
            return median
        elif target > A[median]:
            self.compareMedian(A,target,median,end)
        else:
            self.compareMedian(A,target,start,median)
            
a = Solution()
A = [1,3,5]
print a.searchInsert(A,0)