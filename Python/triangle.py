class Solution:
    # @param triangle, a list of lists of integers
    # @return an integer
    def minimumTotal(self, triangle):
        sumlist = self.sumPath(triangle, len(triangle)-1)
        print sumlist
        return min(sumlist)
    
    def sumPath(self, triangle, n):
        if n == 0:
            return triangle[0]
        sumlist = self.sumPath(triangle, n-1)
        for i in range(n):
            newlist = [0] * len(sumlist) * 2
            print sumlist
            print i,n
            newlist[i] = sumlist[i] + triangle[n][i]
            newlist[i+1] = sumlist[i] + triangle[n][i+1]
        return newlist

s = Solution()
print s.minimumTotal([[1],[2,-3],[1,-1,2]])