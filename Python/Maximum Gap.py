class Solution:
    # @param num, a list of integer
    # @return an integer
    def maximumGap(self, num):
        if len(num) < 2: return 0
        minNum = min(num)
        maxNum = max(num)
        mins = [float('inf')] * (len(num)-1)
        maxs = [-1] * (len(num) - 1)
        
        average = (maxNum - minNum-1)//(len(num) - 1) + 1
        
        for i in num:
            if i == minNum or i == maxNum:
                continue
            index = (i-minNum) // average
            mins[index] = min(mins[index], i)
            maxs[index] = max(maxs[index], i)
        
        pre = minNum
        ret = -1
        for i in range(len(num) - 1):
            if mins[i] == float('inf') and maxs[i] == -1:
                continue
            ret = max(ret, mins[i] - pre)
            pre = maxs[i]
        ret = max(ret, maxNum - pre)
        return ret
            

        
        