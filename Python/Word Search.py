class Solution:
# @param board, a list of lists of 1 length string
# @param word, a string
# @return a boolean
    def exist(self, board, word):
        visited = [[False for m in range(len(board[0]))] for n in range(len(board))] #Key improvement
        for i in range(0,len(board)):
            for j in range(0,len(board[0])):
                if board[i][j] == word[0]:
                    if self.DFS(board, word, visited, 0, i, j):
                        return True
        return False

    def DFS(self,board, word, visited, index, i, j):
        if i >= 0 and j >=0 and i < len(board) and j < len(board[0]) and board[i][j] == word[index] and visited[i][j] == False:
            visited[i][j] = True
            if index + 1 == len(word):
                return True
            if self.DFS(board, word, visited, index + 1, i + 1, j):
                return True
            if self.DFS(board, word, visited, index + 1, i - 1, j):
                return True
            if self.DFS(board, word, visited, index + 1, i , j + 1):
                return True
            if self.DFS(board, word, visited, index + 1, i , j - 1):
                return True
            visited[i][j]=False #Key improvement
        return False