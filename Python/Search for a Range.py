class Solution:
    # @param A, a list of integers
    # @param target, an integer to be searched
    # @return a list of length 2, [index1, index2]
    def searchRange(self, A, target):
        left = 0
        right = len(A) - 1
        ret = [-1, -1]
        while left < right:
            mid = (left + right)/2
            if A[mid]< target:
                left = mid + 1
            else:
                right = mid
        if A[left]==target:
            ret[0] = left
            while left <len(A)-1 and A[left+1]== target:
                left += 1
            ret[1] = left
        return ret