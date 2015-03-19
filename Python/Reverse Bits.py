class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        ret = 0
        for count in range(32):
            if ( n % 2 != 0):
                ret += 2 ** (31-count)
            n = n / 2
        return ret
        