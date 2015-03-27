class Solution:
    # @param board, a 9x9 2D array
    # Solve the Sudoku by modifying the input board in-place.
    # Do not return any value.
    def solveSudoku(self, board):
        self.board = board
        self.fillBoard()
            
    def isValid(self, row, col, num):
        for i in range(9):
            if self.board[i][col] == num or self.board[row][i] == num:
                    return False
        for i in range(row-(row%3), row-(row%3) + 3):
            for j in range(col - (col%3), col - (col%3) + 3):
                if self.board[i][j] == num:
                    return False
        return True
        
    def isEmpty(self):
        for i in range(9):
            for j in range(9):
                if self.board[i][j] == ".":
                    return i, j
        return -1, -1
        
    def fillBoard(self):
        i,j = self.isEmpty()
        if i == -1 and j == -1:
            return True
        for num in  ["1","2","3","4","5","6","7","8","9"]:
            if self.isValid(i,j,num):
                self.board[i][j] = num
                if self.fillBoard():
                    return True
                self.board[i][j] = "."
        return False
        
        