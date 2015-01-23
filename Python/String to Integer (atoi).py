
class Solution:
    # @return an integer
    def atoi(self, str):
        intmax = 2147483647
        intmin = -2147483648
        isPos = True
        ret = 0
        str = str.strip()
        if not str:
            return 0
        if str[0] == "-":
            isPos = False
        elif str[0] == "+":
            isPos = True
        elif 48 <= ord(str[0]) <=57 :
            ret = ord(str[0])-48
        else:
            return 0
        
        str = str[1:]
        for s in str:
            l = ord(s)-48
            if 0 <= l <= 9:
                ret = ret*10 + l
            else:
                if not isPos:
                    ret = -ret
                if ret > intmax:
                    return intmax
                if ret < intmin:
                    return intmin
                return ret

        if not isPos:
            ret = -ret
        if ret > intmax:
            return intmax

        if ret < intmin:
            return intmin
            
        return ret
        