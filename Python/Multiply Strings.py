class Solution:
    # @param num1, a string
    # @param num2, a string
    # @return a string
    def multiply(self, num1, num2):
        len1 = len(num1)
        len2 = len(num2)
        dp = [0] * (len1 + len2)
        
        for i in range(len1 - 1, -1, -1):
            for j in range(len2 - 1, -1, -1): 
                dp[len1 + len2 - i - j -2 ] += (int(num1[i])) * (int(num2[j])) # 两两相乘的和
                dp[len1 + len2 - i - j -1 ] += dp[len1 + len2 - i - j -2 ] / 10 #进位
                dp[len1 + len2 - i - j -2 ] %= 10 # 取余数
        ret = 0
        for i, j in enumerate(dp):
            ret += j*(10** i)           

        return str(ret)