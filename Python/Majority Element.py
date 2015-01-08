class Solution:
    # @param num, a list of integers
    # @return an integer
    def majorityElement(self, num):
        length = len(num)
        if length == 1 or length == 2:
            return num[0]
            
        bar = length / 2
        numberCount = {}
        for i in num:
            if i in numberCount:
                numberCount[i] = numberCount[i]+1
                if numberCount[i]>bar:
                    return i
            else:
                numberCount[i] = 1