
class Solution:
    # @param A, a list of integers
    # @return a boolean
    def canJump(self, A):
        length = len(A)
        i = 0
        reach = 0
        while  i< length and i<=reach:
            reach = max(i + A[i], reach)
            print i, reach, A
            i += 1
            
        return i == length