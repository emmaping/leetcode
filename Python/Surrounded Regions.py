class Solution:
    # @param board, a 2D array
    # Capture all regions by modifying the input board in-place.
    # Do not return any value.
    def solve(self, board):
        if not board:
            return
        row = len(board)
        col = len(board[0])
        if row <3 or col<3:
            return
        
        def helper(i,j):
            s=[(i,j)]
            while s:
                m,n = s.pop()
                board[m][n] = 'M'
                
                if m > 0 and board[m-1][n] == 'O':
                    s.append((m-1,n))
                if m < row-1 and board[m+1][n] == 'O':
                    s.append((m+1,n))
                if n > 0 and board[m][n-1] == 'O':
                    s.append((m,n-1))
                if n < col - 1 and board[m][n+1] == 'O':
                    s.append((m, n+1))
        
        for j in range(col):
            if board[0][j] == 'O':
                helper(0,j)
            if board[row-1][j] == 'O' :
                helper(row-1,j)
        for i in range(1, row-1):
            if board[i][0] == 'O':
                helper(i,0)
            if board[i][col-1] == 'O':
                helper(i, col-1)
        for i in range(row):
            for j in range(col):
                if board[i][j] == 'O':
                    board[i][j] = 'X'
                elif board[i][j] == 'M':
                    board[i][j] = 'O'
            
        

                