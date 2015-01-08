import java.util.HashMap;

public class Solution
{
  public String convertToTitle(int n)
  {
    HashMap<Integer, String> map = new HashMap()
    {
      {
        put(1, "A");
        put(2, "B");
        put(3, "C");
        put(4, "D");
        put(5, "E");
        put(6, "F");
        put(7, "G");
        put(8, "H");
        put(9, "I");
        put(10, "J");
        put(11, "K");
        put(12, "L");
        put(13, "M");
        put(14, "N");
        put(15, "O");
        put(16, "P");
        put(17, "Q");
        put(18, "R");
        put(19, "S");
        put(20, "T");
        put(21, "U");
        put(22, "V");
        put(23, "W");
        put(24, "X");
        put(25, "Y");
        put(0, "Z");
      }
    };

    StringBuilder ret = new StringBuilder();
    int i = n / 26;
    int j = n % 26;
    if (i == 0)
    {
      return map.get(j);
    }

    while (i > 0)
    {
      i = n / 26;
      j = n % 26;

      if (j == 0)
      {
        i--;
      }
      ret.insert(0, map.get(j));
      n = i;
    }
    // ret.reverse();
    return ret.toString();
  }
}
