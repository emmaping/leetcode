class Solution:
    # @return an integer
    def maxArea(self, height):
        j = len(height) - 1
        i = 0        
        maxium = 0

        while i < j:
            maxium = max( maxium, (j-i) * min(height[i], height[j]))
            if height[i] < height[j]:
                i += 1
            elif height[i] >= height[j]:
                j -=1
        return maxium