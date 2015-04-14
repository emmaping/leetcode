import java.util.ArrayList;
import java.util.HashMap;

public class Solution
{
  public String minWindow(String S, String T)
  {
    int start = 0;
    int end = S.length();
    int max = 0;
    int min = S.length();
    Map<Character, List<Integer>> dp = new HashMap<>();
    List<Character> listT = new ArrayList<>();

    for (int i = 0; i < T.length(); i++)
    {
      Character c = T.charAt(i);
      ArrayList cList = new ArrayList<>();
      if (!dp.containsKey(c))
      {
        dp.put(c, cList);
      }
      listT.add(c);
    }
    for (int j = 0; j < S.length(); j++)
    {
      Character s = S.charAt(j);
      if (T.indexOf(s) != -1)
      {
        if (!listT.contains(s) && dp.get(s).size() != 0)
        {
          dp.get(s).remove(0);
        }
        else if (listT.contains(s))
        {
          listT.remove(s);
        }
        dp.get(s).add(j);
      }
      if (listT.size() == 0)
      {
        boolean notFirst = true;

        for (List<Integer> val : dp.values())
        {
          if (notFirst)
          {
            max = val.get(val.size() - 1);
            min = val.get(0);
            notFirst = false;
          }
          if (max < val.get(val.size() - 1))
          {
            max = val.get(val.size() - 1);
          }
          if (min > val.get(0))
          {
            min = val.get(0);
          }
        }
        if ((max - min) < (end - start))
        {
          start = min;
          end = max;
        }
      }
    }

    if (listT.size() != 0)
    {
      return "";
    }
    else
    {
      return S.substring(start, end + 1);
    }
  }
}
