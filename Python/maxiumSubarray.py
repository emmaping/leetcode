class Solution:
    # @param A, a list of integers
    # @return an integer
    def maxSubArray(self, A):
        max = 0
        cur = 0
        if len(A) == 1:
            return A[0]
        if max(A) < 0:
            return max(A)
        for i in range(0, len(A)):
            cur = cur + A[i]
            if cur < 0:
                cur = 0
            elif cur > max:
                max  = cur

s = Solution()
A = [-2,1,3]
print s.maxSubArray(A)