import java.util.ArrayList;
import java.util.List;

public class temp
{
  public static class Person
  {

	    public static List<List<Integer>> combine(int n, int k) {
	        List<Integer> prev = new ArrayList<>();
	        List<List<Integer>> ret = new ArrayList<>();
	        return helper(n, k, 1 ,prev, ret);
	    
	        
	    }
	    public static List<List<Integer>> helper(int n, int k, int offset, List<Integer> prev,  List<List<Integer>> ret) {
	        if (k == 0){
	            ret.add(prev);
	            return ret;
	        } 
	        
	        for (int i = offset; i < n-k+2; i++){
	            List<Integer> cur = new ArrayList<>(prev);
	            cur.add(i);
	            helper(n, k-1, offset+1,cur, ret);
	        }
	        return ret;
	    }

  }

  public static void main(String[] args)
  {
    System.out.println(Person.combine(10, 5));
  }
}
