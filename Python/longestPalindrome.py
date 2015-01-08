class Solution:
    def longestPalindrome(self, s):
        n = len(s)
        if n in [0, 1]:
            return s

        s2 = s[::-1]
        max = []
        for i in range(n):
            for j in range(n, i, -1):
                if i==0:
                    if s[:j] == s2[-j:]:
                        if j > len(max):
                            max = s[:j]

                else:
                    if s[i:j] == s2[-j:-i]:
                        if j - i > len(max):
                            max = s[i:j]
                           
        return max 
s = Solution()
print s.longestPalindrome("aaaacbaaa")