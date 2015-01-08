class Solution:
    # @param num, a list of integer
    # @return a list of lists of integer
    def subsetsWithDup(self, S):
        S.sort()
        ret = [[]]
        size = 0
        index = 0
        if len(S) == 1:
            temp = ret[0][:]
            temp.append(S[0])
            ret.append(temp)
            return ret
        for i in range(len(S)):
            
            if i >=1 and S[i] == S[i-1]:
                index = size
            else:
                index = 0
            
            if index == size:
                temp = ret[index][:]
                temp.append(S[i])
                ret.append(temp)
                print i, index, size, ret
            else:
                for j in (index, size):
                    temp = ret[j][:]
                    temp.append(S[i])
                    ret.append(temp)
                    print i, j, size, ret
            size = len(ret)-1 
        return ret
s = Solution()
print s.subsetsWithDup([1,2,3])