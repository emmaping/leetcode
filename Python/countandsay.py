
class Solution:
    # @return a string
    def countAndSay(self, n):
        numberList=[]
        while n//10:
            numberList.append(n%10)
            n = n//10
        numberList.append(n)
        numberList.reverse()
        print numberList
        tobecompared = numberList[0]
        i = 0
        j = 0
        countList=[]
        
        for i in range(len(numberList)):
            if tobecompared == numberList[i]:
                j = j + 1
            else:
                countList.append(j)
                countList.append(tobecompared)
                tobecompared = numberList[i]
                j = 1
            print countList
        countList.append(j)
        countList.append(tobecompared)
        return ''.join(str(e) for e in countList)
    
s = Solution()
print s.countAndSay(1)