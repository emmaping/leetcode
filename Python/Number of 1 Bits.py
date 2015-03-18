class Solution:
    # @param n, an integer
    # @return an integer
    def hammingWeight(self, n):
        ret = 0
        while n > 0:
            if n % 2 == 1:
                ret+=1
            n = n // 2
        return ret
            
        