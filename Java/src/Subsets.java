import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
  public List<List<Integer>> subsets(int[] S)
  {
    List<List<Integer>> ret = new ArrayList<>();
    ret.add(new ArrayList<Integer>());
    if (S == null)
      return ret;
    Arrays.sort(S);
    for (int i : S)
    {
      List<List<Integer>> cur = new ArrayList<>();
      for (List<Integer> sub : ret)
      {
        List<Integer> a = new ArrayList<>(sub);
        a.add(i);
        cur.add(a);
      }
      ret.addAll(cur);
    }
    return ret;
  }
}
