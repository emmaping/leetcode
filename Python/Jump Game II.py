class Solution:
    # @param A, a list of integers
    # @return an integer
    def jump(self, A):
        if len(A) == 1:
            return 0
        maxReach = A[0]
        edge = 0
        ret = 0

        for i in range(len(A)):
            if i > edge:
                ret += 1
                edge = maxReach

                if edge > len(A) - 1:
                    return ret
            maxReach = max(maxReach, A[i] + i)
            if maxReach < i: return -1
            print i, edge, maxReach

        return ret
    
s = Solution()
print s.jump([2,3,1,1,4])