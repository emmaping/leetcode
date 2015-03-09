class Solution:
    def searchMatrix(self, matrix, target):
        oneDList = []
        for l in matrix:
            oneDList.extend(l)
        
        left = 0
        right = len(oneDList) - 1
        while left <= right:
            mid = (left + right) /2 
            if oneDList[mid] == target: return True
            if oneDList[mid] > target:
                right = mid -1
            else:
                left = mid + 1
        return False