class Solution:
    # @param s, a string
    # @return an integer
    def numDecodings(self, s):
        length = len(s)
        if length == 0 or s[0] == "0":
            return 0
        
        r1 = 1
        r2 = 1
        
        for i in range(1,length):
            if s[i] == '0': r1 = 0
            if s[i-1] == "1" or s[i-1] == "2" and int(s[i]) <= 6:
                r1 = r2 + r1
                r2 = r1 - r2
            else:
                r2 = r1
        return r1