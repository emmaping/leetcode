class Solution:
    # @param gas, a list of integers
    # @param cost, a list of integers
    # @return an integer
    def canCompleteCircuit(self, gas, cost):
        length = len(gas)
        cur = 0
        lack = 0
        index = 0
        for i in range(length):
            cur = cur + gas[i] - cost[i]
            if cur < 0:
                lack = lack + cur
                cur = 0
                index = i + 1
        return index if lack + cur >= 0 else -1