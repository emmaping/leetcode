class Solution:
    # @param x, an integer
    # @return an integer
    def sqrt(self, x):
        ans = 0
        bit = 1 << 15
        while bit > 0:
            ans |= bit
            if ans * ans > x:
                ans ^=bit
            bit >>=1
        return int(ans)