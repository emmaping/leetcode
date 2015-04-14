class Solution:
    # @param prices, a list of integer
    # @return an integer
    def maxProfit(self, prices):
        dp = [0] * len(prices)
        holdOne = float('-inf')
        holdTwo = float('-inf')
        
        sellOne = 0
        sellTwo = 0
        for i in prices:
            sellTwo = max(sellTwo, holdTwo+i)
            holdTwo = max(holdTwo, sellOne -i )
            sellOne = max(sellOne, holdOne + i)
            holdOne = max(holdOne, -i)
        return sellTwo
s = Solution()       
print s.maxProfit([1,4,2,5, 3, 3,4])