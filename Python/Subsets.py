class Solution:
    # @param S, a list of integer
    # @return a list of lists of integer
    def subsets(self, S):
        if not S:
            return []
        if len(S) == 1:
            return [[],S]
        
        pre = self.subsets(S[:-1])
        ret = pre[:]
#        ret.append([S[-1]])

        for l in pre:
            newitem = l[:]
            newitem.append(S[-1])
            ret.append(sorted(newitem))
            
        return sorted(ret)