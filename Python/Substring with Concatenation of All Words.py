import collections
import copy
class Solution:
    # @param S, a string
    # @param L, a list of string
    # @return a list of integer
    def findSubstring(self, S, L):
        ret = []
        if not L:
            return ret
        length = len(L[0])
        dp = collections.defaultdict(int)
        for l in L:
            dp[l] += 1

        for i in range(length):
            dp_tmp = copy.copy(dp)
            j = i
            while j < len(S) - length + 1:
                dp_tmp[S[j:j+length] ]-= 1
                while dp_tmp[S[j:j+length]] < 0:
                    dp_tmp[S[i:i+length]] += 1
                    i += length
                    print i,j, dp_tmp
                j += length
                if j - i == len(L) * length:
                    ret.append(i)
        return ret
s = Solution()
s.findSubstring("barfoothefoobarman", ["foo", "bar"])