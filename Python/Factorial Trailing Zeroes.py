class Solution:
    # @return an integer
    def trailingZeroes(self, n):
        ret = 0
        while n:
            n = n//5
            ret = ret + n
        return ret