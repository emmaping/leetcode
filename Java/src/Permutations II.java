import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
  public List<List<Integer>> permuteUnique(int[] num)
  {
    Arrays.sort(num);
    List<Integer> intList = new ArrayList<Integer>();
    for (int index = 0; index < num.length; index++)
    {
      intList.add(num[index]);
    }
    return helper(intList);

  }

  public List<List<Integer>> helper(List<Integer> intList)
  {
    List<List<Integer>> ret = new ArrayList<>();
    if (intList.size() == 1)
    {
      ret.add(intList);
      return ret;
    }

    for (int index = 0; index < intList.size(); index++)
    {
      if (index > 0 && intList.get(index) == intList.get(index - 1))
        continue;
      List<Integer> prevList = new ArrayList<>(intList);
      prevList.remove(index);
      List<List<Integer>> prevRet = helper(prevList);
      for (List<Integer> l : prevRet)
      {
        l.add(0, intList.get(index));
        ret.add(l);
      }
    }
    return ret;
  }
}
