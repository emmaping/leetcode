class Solution:
    # @param matrix, a list of lists of integers
    # @return a list of integers
    def spiralOrder(self, matrix):
        m = len(matrix)
        if m == 0 :
            return []
        if m == 1:
            return matrix[0]

        n = len(matrix[0])
        if n == 1:
            return [matrix[i][0] for i in range(m)]

        ret = []

        up = 0
        down = m-1
        left = 0
        right = n-1

        while up <=  down and left <=  right :
            if left == right + 1:break
            for i in range( left, right + 1):
                ret.append(matrix[up][i])
            up += 1

            if up == down + 1 :break 
            for i in range(up, down + 1):
                ret.append(matrix[i][right])
            right -= 1

            if right == left - 1: break
            for i in range(right, left-1, -1):
                ret.append(matrix[down][i])
            down -= 1

            if down == up - 1: break 
            for i in range(down , up - 1, -1):
                ret.append(matrix[i][left])
            left += 1
        return ret