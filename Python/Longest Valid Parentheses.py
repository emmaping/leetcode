class Solution:
    # @param s, a string
    # @return an integer
    def longestValidParentheses(self, s):
        dp = [0] * (len(s)+1)
        for i in range(len(s)):    
            if s[i] == "(":
                continue
            else:  
                j = i-dp[i]-1   
                if j >= 0 and s[j] == "(":
                    dp[i+1] = dp[i] + 2
                    if j > 0:
                        dp[i+1] += dp[j]
            print dp
        return max(dp)
s = Solution()
print s.longestValidParentheses("()(())(())")