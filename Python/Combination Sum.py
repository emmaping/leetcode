class Solution:
    # @param candidates, a list of integers
    # @param target, integer
    # @return a list of lists of integers
    def combinationSum(self, candidates, target):
        ret=[]
        candidates.sort() 
        for i,item in enumerate(candidates):
            if target>item:
                subSet=self.combinationSum(candidates[i:],target-item) 
                if subSet:
                    ret+=[[item]+lis for lis in subSet]
            elif target==item:
                ret+=[[item]]
            else:
                break
        return ret
s = Solution()
print s.combinationSum([2,3,6,7], 7)