class Solution:
    # @param grid, a list of lists of integers
    # @return an integer
    def minPathSum(self, grid):
        n = len(grid)
        m = len(grid[0])
        
        if n== 1 and m==1:
            return grid[0][0]
        if n== 1:
            return sum(grid[0])
        if m == 1:
            return sum([_[0] for _ in grid])
        
        path=[[0]*m]*n
        path[0][0]=grid[0][0]
        
        for col in range(1,m):
            path[0][col]=path[0][col-1]+grid[0][col]
        for row in range(1,n):
            path[row][0]=path[row-1][0]+grid[row][0]
        for col in range(1,m):
            for row in range(1,n):
                path[row][col]=min(path[row-1][col],path[row][col-1]) + grid[row][col]
        return path[row][col]