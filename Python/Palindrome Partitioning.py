class Solution:
    # @param s, a string
    # @return a list of lists of string
    def partition(self, s):
        if not s:
            return [[]]
        return self.partitionHelper(s, 0 ,len(s))
    
    def partitionHelper( self, s, start, end):
        ret = []
        if self.isPalindrome(s[start:end]):
            ret.append([s[start:end]])
        if end - start == 1:
            return ret
        for i in range(start+1, end):
            if self.isPalindrome(s[start:i]):
                newList = self.partitionHelper(s, i, end)
                for l in newList:
                    print newList,l
                    l.insert(0, s[start:i])
                ret.extend(newList)
        return ret
        
        
    def isPalindrome(self,s):
        return s[::-1] == s
    
s = Solution()
print s.partition("ab")