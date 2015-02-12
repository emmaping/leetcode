class Solution:
    # @return an integer
    def divide(self, dividend, divisor):
        if divisor == 1: return dividend
        
        a = abs(dividend)
        b = abs( divisor)
        
        result = 0
        i = 0
        
        while ( a > b):
            i += 1
            b = b << 1
        
        while i >= 0:
            if a >= b:
                a -= b
                result += 1 << i
            
            b = b >> 1
            i = i - 1
            
        if dividend >> 31 != divisor >> 31:
            result = -result
        return min(result,2147483647)
            