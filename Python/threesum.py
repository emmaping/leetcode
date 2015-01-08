class Solution:
    # @return a list of lists of length 3, [[val1,val2,val3]]
    def threeSum(self, num):
        if len(num) < 3:
            return []
        num.sort()
        largelist = []
        smalllist = []
        zerolist = []
        ret = []
        for i in num:
            if i > 0:
                largelist.append(i)
            elif i == 0:
                zerolist.append(i)
            else:
                smalllist.append(i)
        if len(zerolist) >= 3:
            ret.append([0,0,0])
                
        if len(smalllist) == 0  or len(largelist) == 0:
            return ret

        if len(zerolist) > 0:
            for large in set(largelist):
                if -large in smalllist:
                    ret.append([-large, 0, large])
            
        prem = pren = 0 
        for m in range(len(largelist)):
            for n in range( m + 1, len(largelist)):
                if (largelist[m] == prem and largelist[n] == pren) or largelist[m]+ largelist[n] > -smalllist[0]:
                    break
                if -(largelist[m]+ largelist[n]) in smalllist:
                    ret.append( [-(largelist[m]+ largelist[n]),largelist[m], largelist[n]])
                    prem = largelist[m]
                    pren = largelist[n]
        prem = pren = 0 
        for m in range(len(smalllist)):
            for n in range( m + 1, len(smalllist)):
                if (smalllist[m] == prem and smalllist[n] == pren) or smalllist[m]+ smalllist[n]  < -largelist[-1]:
                    break
                if -(smalllist[m]+ smalllist[n]) in largelist:
                    ret.append( [smalllist[m], smalllist[n], -(smalllist[m]+ smalllist[n])])
                    prem = smalllist[m]
                    pren =  smalllist[n] 
        return  ret 
s = Solution()
print s.threeSum([-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0])