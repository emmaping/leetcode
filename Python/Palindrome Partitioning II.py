class Solution:
    # @param s, a string
    # @return an integer
    def minCut(self, s):
        dp = [0] * (len(s)+1)
        matrix = [[False for i in range(len(s)+1)] for j in range(len(s)+1)]
        for i in range(1, len(s) + 1):
            dp[i] = i
            for j in range(1, i+1):
                if s[i-1] == s[j-1]:
                    if i-j<2 or matrix[j+1][i-1]:
                        matrix[j][i] = True
                        if j==1: 
                            dp[i] = 0
                        else:
                            dp[i] = min(dp[i],dp[j-1]+1)
        return dp[len(s)]
        
s = Solution()
print s.minCut("aac")        