import java.util.ArrayList;
import java.util.Comparator;

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution
{
  public List<Interval> merge(List<Interval> intervals)
  {
    List<Interval> ret = new ArrayList<>();
    if (intervals.size() <= 1)
      return intervals;
    Collections.sort(intervals, new Comparator<Interval>()
    {
      @Override
      public int compare(Interval last, Interval cur)
      {
        return last.start - cur.start;
      }
    });
    Interval last = intervals.get(0);
    for (Interval cur : intervals)
    {
      if (last.end >= cur.start)
      {
        last.end = Math.max(cur.end, last.end);
      }
      else
      {
        ret.add(last);
        last = cur;
      }
    }
    ret.add(last);
    return ret;
  }
}
