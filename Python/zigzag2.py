class Solution:
    # @return a string
    def convert(self, s, nRows):
        if nRows == 1:
            return 
        rowstep = 2 * nRows -2
        colstep = nRows - 1
        if len(s) % rowstep:
            if len(s) % rowstep <= nRows:
                columnstep = (nRows -1)*(len(s) // rowstep) + 1
            if len(s) % rowstep > nRows:
                columnstep = (nRows -1)*(len(s) // rowstep) + 1 + len(s)% rowstep - nRows
        else:
            columnstep = (nRows -1)*(len(s) // rowstep)
        print columnstep
        s = list(s)
        retlist = [0]*(nRows * columnstep)
        index = 0 
        for i in range(0,len(s),rowstep):
            for j in range(rowstep):
                try :
                    data = s[i + j]
                except:
                    break
                if j < nRows:
                    retlist[j * columnstep + index * (nRows - 1)] = data
                else:
                    retlist[(2 * nRows - j -2) * columnstep + index * (nRows -1) + j - nRows + 1] = data
                print retlist
            index = index + 1
        ret = []
        for i in retlist:
            if i!= 0:
                ret.append(i)
        print ret      
        return ''.join(ret)
s = Solution()
print s.convert('0123456789',3) 