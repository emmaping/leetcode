class Solution:
    # @param s, a string
    # @return a list of strings
    def restoreIpAddresses(self, s):
        length = len(s)
        if length < 4 or length >12:
            return []
        ret = []
        for i in range(1,4):
            for j in [i+1, i+2, i+3]:
                for k in [j+1, j+2, j+3]:
                    if k >= length:
                        continue
                    s1 = s[:i]
                    s2 = s[i:j]
                    s3 = s[j:k]
                    s4 = s[k:]
                    
                    strlist = [s1,s2,s3,s4]
                    if self.isValid(strlist):
                        ret.append(".".join(strlist))
        return ret
        
    def isValid(self, strlist):
        for s in strlist:
            if s[0] == "0" and s != "0":
                return False
            if int(s) > 255:
                return False
        return True