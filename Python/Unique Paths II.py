class Solution:
    # @param obstacleGrid, a list of lists of integers
    # @return an integer
    def uniquePathsWithObstacles(self, obstacleGrid):
        n = len(obstacleGrid)
        m = len(obstacleGrid[0])


        grid =  [[0 for i in range(m)] for j in range(n)]
        if obstacleGrid[0][0] == 1:
            return 0
        else:
            grid[0][0] = 1
        
        for i in range(1,m):
            if obstacleGrid[0][i] == 1:
                break;
            else:
                grid[0][i] = 1;
        
        for j in range(1, n):
            if obstacleGrid[j][0] == 1:
                break;
            else:
                grid[j][0] = 1;
        
        for j in range(1,n):
            for i in range(1,m):
                if obstacleGrid[j][i] == 1:
                    grid[j][i] = 0
                else:
                    grid[j][i] = grid[j-1][i] + grid[j][i-1]
        
        return grid[n-1][m-1]