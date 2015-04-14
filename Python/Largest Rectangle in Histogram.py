class Solution:
    # @param height, a list of integer
    # @return an integer
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
                print stack, i, s, h
            stack.append(i)
        return ret
            
s = Solution()
print s.largestRectangleArea([6,2,5,4,5,1,6])