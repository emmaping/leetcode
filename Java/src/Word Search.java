import java.util.Arrays;

public class Solution
{
  public boolean exist(char[][] board, String word)
  {
    char[] charWord = word.toCharArray();
    boolean[][] visited = new boolean[board.length][board[0].length];
    for (int x = 0; x < visited.length; x++)
    {
      Arrays.fill(visited[x], false);
    }
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
      {
        if (board[i][j] == charWord[0])
        {
          if (DFS(board, i, j, charWord, 0, visited))
            return true;
        }
      }
    }
    return false;
  }

  private boolean DFS(char[][] board, int i, int j, char[] charWord, int index, boolean[][] visited)
  {
    if (index == charWord.length)
      return true;
    if (j < 0 || i < 0 || i == board.length || j == board[0].length || visited[i][j])
      return false;
    if (board[i][j] != charWord[index])
      return false;

    visited[i][j] = true;
    if (DFS(board, i + 1, j, charWord, index + 1, visited))
      return true;
    if (DFS(board, i - 1, j, charWord, index + 1, visited))
      return true;
    if (DFS(board, i, j - 1, charWord, index + 1, visited))
      return true;
    if (DFS(board, i, j + 1, charWord, index + 1, visited))
      return true;
    visited[i][j] = false;
    return false;
  }
}
