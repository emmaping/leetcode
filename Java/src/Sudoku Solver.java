public class Solution
{
  private char[][] board;

  public void solveSudoku(char[][] board)
  {
    this.board = board;
    fillBoard();
  }

  private boolean isValid(int row, int col, char num)
  {
    for (int i = 0; i < 9; i++)
    {
      if (board[i][col] == num || board[row][i] == num)
        return false;
    }

    for (int i = row - (row % 3); i < row - (row % 3) + 3; i++)
    {
      for (int j = col - (col % 3); j < col - (col % 3) + 3; j++)
      {

        if (board[i][j] == num)
          return false;
      }
    }
    return true;
  }

  private int[] isEmpty()
  {
    int[] ret = new int[2];
    for (int row = 0; row < 9; row++)
    {
      for (int col = 0; col < 9; col++)
      {
        if (board[row][col] == '.')
        {
          ret[0] = row;
          ret[1] = col;
          return ret;
        }
      }
    }
    ret[0] = -1;
    ret[1] = -1;
    return ret;
  }

  private boolean fillBoard()
  {
    int[] emptyPoint = new int[2];
    emptyPoint = isEmpty();
    if (emptyPoint[0] == -1 && emptyPoint[1] == -1)
      return true;
    int row = emptyPoint[0];
    int col = emptyPoint[1];

    for (char num = '1'; num <= '9'; num++)
    {
      if (isValid(row, col, num))
      {
        board[row][col] = num;
        if (fillBoard())
        {
          return true;
        }
        board[row][col] = '.';
      }
    }
    return false;
  }
}
