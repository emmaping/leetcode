class Solution:
    # @return an integer
    def reverse(self, x):
        isNeg = False
        if x<0 :
            isNeg = True
            x = -x
        ret = 0
        while x:
            x, ret = x//10, ret * 10+ x%10
        if ret > pow(2, 31):
            return 0
        if isNeg:
            ret = -ret
        return ret
        