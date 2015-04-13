class Solution:
    # @param S, a string
    # @param T, a string
    # @return an integer
    def numDistinct(self, S, T):
        dp = [[0 for i in range(len(T)+1)] for j in range(len(S)+1)]
        for i in range(0, len(S)+1):
            for j in range(0, len(T)+1):
                if i == 0 and j == 0:
                    dp[i][j] = 1
                elif j == 0:
                    dp[i][j] = 1
                elif i == 0:
                    dp[i][j] = 0
                elif i < j:
                    dp[i][j] = 0
                else:
                    if S[i-1] == T[j-1]:
                        dp[i][j] = dp[i-1][j-1]+dp[i-1][j]
                    else:
                        dp[i][j] = dp[i-1][j]
                print dp
        return dp[len(S)][len(T)]
s = Solution()
print s.numDistinct("AACDE", "ACE")