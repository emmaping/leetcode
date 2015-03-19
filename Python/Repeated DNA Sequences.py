class Solution:
    # @param s, a string
    # @return a list of strings
    def findRepeatedDnaSequences(self, s):
        dictionary = dict()
        for i in range(len(s)):
            dictionary[s[i:i+10]] = dictionary.get(s[i:i+10],0) + 1
        return [key for key, value in dictionary.iteritems() if value>1]
    
s = Solution()
print s.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")