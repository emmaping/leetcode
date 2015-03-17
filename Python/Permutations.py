
class Solution:
    # @param num, a list of integer
    # @return a list of lists of integers
    def permute(self, num):
        length = len(num)
        ret = []
        num.sort()
        reversenum = num[::-1]
        innerdata = num[:]
        ret.append(innerdata[:])
        i = 0
        while innerdata != reversenum:
            for i in range(length-1, 0, -1):
                if innerdata[i-1] < innerdata[i]:
                    newlist = innerdata[:i-1:-1]
                    
                    for l in range(len(newlist)):
                        if innerdata[i-1] < newlist[l]:
                            temp = innerdata[i-1]
                            innerdata[i-1] = newlist[l] 
                            newlist[l] = temp
                            innerdata = innerdata[:i] + newlist
                            break
                    break
            ret.append(innerdata[:]) 
        return ret 
        