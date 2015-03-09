class Solution:
    # @param matrix, a list of lists of integers
    # RETURN NOTHING, MODIFY matrix IN PLACE.
    def setZeroes(self, matrix):
        if not matrix:
            return
        m = len(matrix[0]) 
        n = len(matrix)
        row = False
        col = False
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    if i == 0:
                        row = True
                    if j == 0:
                        col = True
                    matrix[i][0] = 0
                    matrix[0][j] = 0
        for i in range(1,n):
            for j in range(1,m):
                if matrix[i][0] == 0 or matrix[0][j] == 0: matrix[i][j] = 0
    
        if row:
            for j in range(m):
                matrix[0][j] = 0
        if col:
            for i in range(n):
                matrix[i][0] = 0  