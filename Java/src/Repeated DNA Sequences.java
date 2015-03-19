import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution
{
  public List<String> findRepeatedDnaSequences(String s)
  {
    HashMap<String, Integer> map = new HashMap<>();
    List<String> ret = new ArrayList<>();
    String key;
    int value;
    for (int i = 0; i < s.length() - 10; i++)
    {
      key = s.substring(i, i + 10);
      if (map.containsKey(key))
      {
        value = map.get(key);
        map.put(key, value + 1);
      }
      else
      {
        map.put(key, 1);
      }
    }

    for (HashMap.Entry<String, Integer> entry : map.entrySet())
    {
      if (entry.getValue() > 1)
        ret.add(entry.getKey());
    }
    return ret;
  }
}
