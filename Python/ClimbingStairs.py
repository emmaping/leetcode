class Solution:
    # @param n, an integer
    # @return an integer
    def climbStairs(self, n):
        if n == 0 or n == 1 or n == 2 :
            return n
        ways = [0]*n
        
        ways[0]=1
        ways[1]=2
        for i in range(2, n-1):
            ways[i] = ways[i-1] + ways[i-2]
        return ways[n-1]
    
s = Solution()
print s.climbStairs(5)