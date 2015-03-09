class Solution:
    # @param A, a list of integers
    # @param target, an integer to be inserted
    # @return integer
    def searchInsert(self, A, target):
        start = 0
        end = len(A) - 1
        while start <= end:
            mid = (start + end)/2;
            if A[mid] == target:
                return mid
            elif A[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        return start
        