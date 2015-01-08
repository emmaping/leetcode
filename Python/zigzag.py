class Solution:
    # @return a string
    def convert(self, s, nRows):
        if nRows == 1:
            return 
        rowstep = 2 * nRows -2
        zigzag = False
        zigzaglist = []
        stringlist = list(s)
        for i in range(0,len(stringlist),rowstep):
            ziglist = []
            zaglist = []
            for j in range(rowstep):
                zag = [0]*nRows
                try :
                    data = stringlist[i + j]
                except:
                    break
                if j%rowstep < nRows:
                    print i,j
                    ziglist.append(data)
                else:
                    zag[nRows +1 - j%rowstep] = data
                    zaglist.append(zag)
            zigzaglist.append(ziglist)
            for zag in zaglist:
                zigzaglist.append(zag)
        print zigzaglist
        temp = []
        for j in range(nRows):
            for zag in zigzaglist:
                try:
                    if zag[j] != 0:
                        temp.append(zag[j])
                except:
                    break


        return ''.join(temp)

s = Solution()
print s.convert('0123456789',3)    
                
                
            
            
            