class Solution:
    # @param A a list of integers
    # @param target an integer
    # @return a boolean
    def search(self, A, target):
        right = len(A)-1
        left = 0
        
        while left <= right:
            mid = (left + right) /2
            if A[mid] == target:
                return True
            if A[left] < A[mid]:
                if A[left] <= target and target < A[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            elif A[left] > A[mid]:
                if A[right] >= target and target > A[mid]:
                    left = mid + 1
                else:
                    right = mid - 1
            else:
                left += 1
        return False