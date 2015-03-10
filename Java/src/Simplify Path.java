import java.util.Deque;
import java.util.LinkedList;

public class Solution
{
  public String simplifyPath(String path)
  {
    Deque<String> deque = new LinkedList<String>();
    String[] pathArray = path.split("/");
    for (String s : pathArray)
    {
      if (s.equals(".."))
      {
        if (!deque.isEmpty())
        {
          deque.pop();
        }
      }

      else if (!s.equals(".") && !s.equals(""))
      {
        deque.push(s);
      }
    }

    String ret = "";
    for (String s : deque)
    {
      ret = "/" + s + ret;
    }
    return ret.isEmpty() ? "/" : ret;
  }
}
