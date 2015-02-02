class Solution:
    # @param triangle, a list of lists of integers
    # @return an integer
    def minimumTotal(self, triangle):
        if not triangle:
            return 0
        if len(triangle) == 1:
            return triangle[0][0]
        a = triangle[-1]
        
        for i in range(len(triangle)-2, -1, -1):
            for j in range(i+1):
                a[j] = min(a[j], a[j+1]) + triangle[i][j]
        return a[0]