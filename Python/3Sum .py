class Solution:
    # @return a list of lists of length 3, [[val1,val2,val3]]
    def threeSum(self, num):
                            
        def helper(list1, list2, ret):
            if len(list1) == 0 or len(list2)==0:
                return ret
            if len(list1) < 2:
                return ret
            sumList = []
            for i in range(len(list1)-1):
                for j in range(i+1, len(list1)):
                    sum = (list1[i] + list1[j]) * -1
                    if sum in list2 and [list1[i],list1[j]] not in sumList:
                        if sum < 0:
                            ret.append([sum, list1[i], list1[j]])
                        else:
                            ret.append([list1[i],list1[j], sum])
                        sumList.append([list1[i],list1[j]])
                        
        ret = []
        if not num or len(num)<3:
            return ret
        num.sort()
        negList = []
        posList = []
        zeroList = []
        
        for i in num:
            if i < 0 :
                negList.append(i)
            elif i > 0:
                posList.append(i)
            else:
                zeroList.append(i)
                
        if len(zeroList) > 0:
            for i in set(negList):
                if i*-1 in posList:
                    ret.append([i,0,-i])
            if len(zeroList) >= 3:
                ret.append([0,0,0])
            
        helper(negList, posList, ret)
        helper(posList, negList, ret)
                    
        return ret 

s = Solution()
print s.threeSum([-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6])