class Solution:
    # @return a list of lists of integers
    def generate(self, numRows):
        ret = []
        if numRows == 0:
            return []
        ret=[[1]]
        for i in range(1,numRows):
            prelist = ret[i-1][:]
            prelist.insert(0,0)
            prelist.append(0)
            curlist = []
            for j in range(len(prelist)-1):
                curlist.append(prelist[j]+prelist[j+1])
            ret.append(curlist)
        return ret
    def genRows(self, numRow):
        if numRow == 0:
            return   []
        if numRow == 1:
            return  [1]
        if numRow == 2:
            return  [1,1]
        preRow = self.genRows(numRow-1)
        preRow.append(0)
        preRow.insert(0,0)
        ret = []
        for i in range(len(preRow)-1):
            ret.append(preRow[i]+  preRow[i+1])
        return ret

s = Solution()
print s.generate(1)