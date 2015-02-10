import copy
class Solution:
    # @param num, a list of integer
    # @return a list of lists of integer
    def subsetsWithDup(self, S):
        S.sort()
        ret = [[]]
        length = len(S)
        if length == 0:
            return ret
        last = [[S[0]]]
        ret = [[],[S[0]]]
        for i in range(1, length):
            if S[i] == S[i-1]:
                for l in last:
                    l.append(S[i])
                ret.extend(copy.deepcopy(last))
            else:
                last = copy.deepcopy(ret)
                for l in last:
                    l.append(S[i])
                ret.extend(copy.deepcopy(last))
        return ret
            
s = Solution()
print s.subsetsWithDup([1,1])