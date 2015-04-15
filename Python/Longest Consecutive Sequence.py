class Solution:
    # @param num, a list of integer
    # @return an integer
    def longestConsecutive(self, num):
        num.sort()
        ret = 0
        cur = 0
        if len(num) == 1: return 1
        for i in range(1,len(num)):
            if num[i] == num[i-1]+1:
                cur = cur + 1
            elif num[i] == num[i-1]:
                continue
            else:
                ret = max(ret, cur+1)
                cur = 0
        return max(ret, cur+1)
        
s = Solution()
print s.longestConsecutive([100, 4, 200, 1, 3, 2])