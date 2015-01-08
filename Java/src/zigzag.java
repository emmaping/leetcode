public class zigzag
{
  public String convert(String s, int nRows)
  {
    int length = s.length();

    if (length == 1 || nRows == 1)
    {
      return s;
    }
    int i = length / (nRows * 2 - 2);
    int j = length % (nRows * 2 - 2);
    int col = 0;
    if (j == 0)
    {
      col = i * (nRows - 1);
    }
    else if (j <= nRows)
    {
      col = i * (nRows - 1) + 1;
    }
    else
    {
      col = i * (nRows - 1) + 1 + j - nRows;
    }

    char[][] matrix = new char[nRows][col];

    for (int k = 0; k < length; k++)
    {
      int x;
      int y;
      int m = k / (nRows * 2 - 2);
      int n = k % (nRows * 2 - 2);

      if (n < nRows)
      {
        x = n;
        y = m * (nRows - 1);
      }
      else
      {
        x = 2 * nRows - n - 2;
        y = m * (nRows - 1) + n - nRows + 1;
      }
      System.out.println("input" + m + n + x + y + k + s.charAt(k));
      matrix[x][y] = s.charAt(k);
    }

    StringBuilder ret = new StringBuilder();
    for (int n = 0; n < matrix.length; n++)
    {
      for (int m = 0; m < matrix[n].length; m++)
      {
        if (matrix[n][m] != 0)
        {
          ret.append(matrix[n][m]);
        }
      }
    }
    String result = ret.toString();
    return result;

  }

  public static void main(String[] args)
  {
    String s = "ABCD";
    int nRows = 3;
    zigzag z = new zigzag();
    System.out.println(z.convert(s, 3));
  }
}
