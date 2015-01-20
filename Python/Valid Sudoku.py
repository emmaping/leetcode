class Solution:
    # @param board, a 9x9 2D array
    # @return a boolean
    def isValidSudoku(self, board):
        for i in range(9):
            a = [0] * 9
            b = [0] * 9
            c = [0] * 9
            for j in range(9):
                if board[i][j] != '.':
                    num1 = int(board[i][j]) -1
                    if a[num1]:
                        return False
                    else:
                        a[num1] = 1
                if board[j][i] != '.':
                    num2 = int(board[j][i]) - 1
                    if b[num2]:
                        return False
                    else:
                        b[num2] = 1
                if board[i/3*3+j/3][i%3*3+j%3] != '.':
                    num3 = int(board[i/3*3+j/3][i%3*3+j%3]) -1
                    if  c[num3]:
                        return False
                    else:
                        c[num3] = 1
                
        return True