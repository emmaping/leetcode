import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution
{
  public List<String> anagrams(String[] strs)
  {
    Map<String, List<String>> dict = new HashMap<>();
    List<String> ret = new LinkedList<>();

    for (String s : strs)
    {
      char[] key = s.toCharArray();
      Arrays.sort(key);
      String dictKey = new String(key);
      if (dict.containsKey(dictKey))
      {
        dict.get(dictKey).add(s);
      }
      else
      {
        List<String> strList = new ArrayList<>();
        strList.add(s);
        dict.put(dictKey, strList);
      }
    }

    for (Map.Entry<String, List<String>> entry : dict.entrySet())
    {
      List<String> value = entry.getValue();

      if (value.size() > 1)
      {
        ret.addAll(value);
      }
    }
    return ret;
  }
}
