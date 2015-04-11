class Solution:
    # @return a boolean
    def isScramble(self, s1, s2):
        if sorted(s1) != sorted(s2):
            return False
        if s1 == s2:
            return True
        func = self.isScramble
        for i in range(1, len(s1)):
            if (func(s1[:i], s2[:i]) and func(s1[i:], s2[i:]) ): return True
            if (func(s1[:i], s2[-i:]) and func(s1[i:], s2[:-i])): return True
                
        return False