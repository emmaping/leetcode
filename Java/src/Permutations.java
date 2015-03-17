import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
  public List<List<Integer>> permute(int[] num)
  {
    int length = num.length;
    List<List<Integer>> ret = new ArrayList<>();
    if (length == 0)
      return ret;
    Arrays.sort(num);
    List<Integer> numList = new ArrayList<>();
    numList.add(num[0]);
    ret.add(numList);

    for (int i = 1; i < length; i++)
    {
      List<List<Integer>> newList = new ArrayList<>();
      for (int j = 0; j <= i; j++)
      {
        for (List<Integer> k : ret)
        {
          List<Integer> copyOfK = new ArrayList<>(k);
          copyOfK.add(j, num[i]);
          newList.add(copyOfK);
        }
      }
      ret = newList;
    }
    return ret;
  }
}
