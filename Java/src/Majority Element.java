import java.util.HashMap;

public class Solution
{
  public int majorityElement(int[] num)
  {
    int length = num.length;
    if (length <= 2)
    {
      return num[0];
    }
    int bar = length / 2;

    Map<Integer, Integer> numberCount = new HashMap<>();
    for (int i : num)
    {

      if (numberCount.get(i) != null)
      {
        int count = numberCount.get(i) + 1;
        numberCount.put(i, count);
        if (count > bar)
        {
          return i;
        }
      }
      else
      {
        numberCount.put(i, 1);
      }
    }
    return 0;
  }
}
