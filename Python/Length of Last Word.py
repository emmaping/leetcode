class Solution:
    # @param s, a string
    # @return an integer
    def lengthOfLastWord(self, s):
        if not s:
            return 0
        s = s.strip().split()
        print s
        if not s or len(s) == 0:
            return 0
        return len(s[-1])
        
s = Solution()
print s.lengthOfLastWord(" ")