class Solution:
    # @param num, a list of integer
    # @return a list of integer
    def nextPermutation(self, num):
        if len(num) == 0 or len(num) == 1:
            return num
            
        index = len(num) - 2
        while index >= 0 and num[index] >= num[index + 1] :
            index -= 1
        if index == -1:
            return num[::-1]    
        if index >= 0:
            num = num[:index + 1] + list(reversed(num[index + 1:]))
            for i in range(index +1  , len(num)):
                if num[i] > num[index]:
                    temp = num[i]
                    num[i] = num [index]
                    num[index] = temp
                    break
        return num
            
        