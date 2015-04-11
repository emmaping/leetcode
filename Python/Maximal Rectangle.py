class Solution:
    # @param matrix, a list of lists of 1 length string
    # @return an integer
    def maximalRectangle(self, matrix):
        ret = 0
        if not matrix:
            return 0
        height = len(matrix)
        width = len(matrix[0])
        h = [0]*width

        for i in range(height):
            for j in range(width):
                if matrix[i][j] == '1':
                    h[j] = h[j] + 1
                else:
                    h[j] = 0
            ret = max(self.largestRectangleArea(h), ret)
        return ret

    def largestRectangleArea(self, height):
        ret = 0
        height.append(0)
        stack = []
        
        for i in range(len(height)):
            while len(stack) > 0 and height[stack[-1]] >= height[i]:
                h = height[stack.pop()]
                if stack:
                    s = stack[-1]
                else:
                    s = -1
                if  h * (i - s - 1 ) > ret:
                    ret = h * (i - s - 1 )
            stack.append(i)
        return ret
        