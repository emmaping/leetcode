class Solution:
    # @param s, a string
    # @param wordDict, a set<string>
    # @return a string[]
    def wordBreak(self, s, wordDict):
        self.dic = wordDict
        self.saved = {}
        return self.helper(s)

    def helper(self, s):
        cur = []
        if s in self.saved:
            return self.saved[s]
        if len(s) == 0:
            return []
        for i in range(len(s)):
            if s[:i+1] in self.dic:
                if i == len(s) - 1:
                    cur.append(s[:i+1])
                else:
                    subList = self.helper(s[i+1:])
                    for l in subList:
                        cur.append(s[:i+1] + ' ' + l)
        self.saved[s] = cur
        return cur
            