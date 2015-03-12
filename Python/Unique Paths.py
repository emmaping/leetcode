
class Solution:
    # @return an integer
    def uniquePaths(self, m, n):
        if m == 0 or n == 0:
            return 0
        if m == 1 or n == 1:
            return 1
        grid = [[0] * m] * n 
        
        grid[0] = [1]* m
        
        for j in range(n):
            grid[j][0] = 1
        
        for i in range(1,n):
            for j in range(1,m):
                grid[i][j] = grid[i-1][j] + grid[i][j-1]
        
        return grid[n-1][m-1]