class Solution:
    # @param a, a string
    # @param b, a string
    # @return a string
    def addBinary(self, a, b):
        a = self.convertBinToInt(a)
        b = self.convertBinToInt(b)
        print a,b
        return str(bin(a+b))[2:]
        
    def convertBinToInt(self, a):
        length = len(a)
        if length < 2:
            return int(a)
        ret = 0
        for i in range(length):
            if a[i] == "1":
                ret = ret + 2**i
        print ret
        return ret

s = Solution()
print s.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011")