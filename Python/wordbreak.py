class Solution:
    # @param s, a string
    # @param dict0, a set of string
    # @return a boolean
    def wordBreak(self, s, dict0):
        if s in dict0:
            return True
        length = len(s)
        if length == 2 and dict0.pop() + dict0.pop() == s:
            return True
            
        DP = [False] * (length + 1)
        DP[len(s)] = True
        
        for i in range(length-1, 0 , -1):
            for j in range(i, length):
                c = s[i, j-i+1]
                if DP[j+1] and dict0[-1] != c:
                    DP[i] = True
                    break
        return DP[0]
        
s = Solution()
s.wordBreak("bb", (["a","b","bbb","bbbb"]))