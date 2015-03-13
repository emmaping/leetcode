
class Solution:
    # @return a list of lists of integer
    def generateMatrix(self, n):
        if n == 0 :
            return []
        if n == 1:
            return [[1]]
        
        ret = [[0 for col in range(n)] for row in range(n)]
        
        up = 0
        down = n-1
        left = 0
        right = n-1

        i = 0
        j = 0
        data = 1
        while up <= down and left <= right:
            for i in range( left, right + 1):
                ret[up][i] = data
                data += 1
            up += 1
            
            for i in range(up, down + 1):
                ret[i][right] = data
                data += 1
            right -= 1
            
            for i in range(right, left-1, -1):
                ret[down][i] = data
                data += 1
            down -= 1
            
            for i in range(down , up - 1, -1):
                ret[i][left] = data
                data += 1
            left += 1
        return ret