class Solution:
    # @param x, a float
    # @param n, a integer
    # @return a float
    def pow(self, x, n):
        if n < 0:
            n = -n
            x = 1 / x
        ret = 1
        
        while n > 0 :
            if n%2 == 1:
                ret *= x
            x = x * x
            n = n >> 1
        
        return ret
s = Solution()
print s.pow(3, 6)