class Solution:
    # @param prices, a list of integer
    # @return an integer
    def maxProfit(self, prices):
        length = len(prices)
        if not prices:
            return 0
        ret = 0
        start = end = 0
        for i in range(1, length):
            if prices[i] < prices[start]:
                start = i
                end = i 
            elif prices[i] > prices[end]:
                end = i
                ret = max(ret, prices[end] - prices[start])
            
        return ret
            
        