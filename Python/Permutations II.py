class Solution:
    # @param num, a list of integer
    # @return a list of lists of integers
    def permuteUnique(self, num):
        num.sort()
        return self.helper(num)
        
    def helper(self, num):
        if len(num) == 1: return [num]
        ret = []
        for index, cur in enumerate(num):
            if index > 0 and num[index-1] == cur:
                continue
            print self.helper(num[:index] + num[index+1:])
            ret += [[cur] + prev for prev in self.helper(num[:index] + num[index+1:])]
            print ret
        return ret
                
        
s = Solution()
print s.permuteUnique([1,1,2])        