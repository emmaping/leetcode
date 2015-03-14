class Solution:
    # @param candidates, a list of integers
    # @param target, integer
    # @return a list of lists of integers
    def __init__(self):
        ret = []
        
    def combinationSum2(self, candidates, target):
        ret = []
        candidates.sort() 
        for i,item in enumerate(candidates):
            if target>item:
                subSet=self.combinationSum2(candidates[i+1:],target-item) 
                if subSet:
                    for lis in subSet:
                        if not [item] + lis in ret:
                            ret += [[item] + lis]

            elif target==item:
                newSet = set()
                if not [item] in ret: 
                    ret+=[[item]]

            else:
                break
        return ret