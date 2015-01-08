class Solution:
    # @return an integer
    def atoi(self, str):
        isPos = True
        str = str.strip()
        if str[0] == "-":
            isPos = False
        elif str[0] == "+":
            isPos = True
        else:
            ret = int(str[0])
        print ret    
        str = reversed(str[1:])
        for s in str:
            l= int(s)
            print l
            if 0 <= l <= 9:
                ret = ret*10 + l
        return ret
            
s = Solution()
print s.atoi("   34567")            
        
        