class Solution:
    # @return a tuple, (index1, index2)
    def getIndex(self,num1, num2 , num):
        index1 = num.index(num1) + 1
        if num1 != num2:
            index2 = num.index(num2) + 1
        else:
            index2 = num.index(num2, index1) + 1 
        return (index1, index2) if index1 < index2 else (index2, index1)
        
    
    def twoSum(self, num, target):
        length = len(num)
        numbers = sorted(num)
        for i in range(length):
            for j in range(i+1, length):
                if (numbers[i] + numbers[j]) == target:
                    return self.getIndex(numbers[i], numbers[j], num)
                elif (numbers[i] + numbers[j]) > target:
                    break
        else:
            return 0
                    

    
numbers=[0,4,3,0]
target=0    
solution = Solution()
print solution.twoSum(numbers, target)