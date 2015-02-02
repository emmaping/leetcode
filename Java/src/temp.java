import java.util.List;
import java.util.ArrayList;

public class temp {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null ) return 0;
        int length = triangle.size();
        if (length== 1) return triangle.get(0).get(0);
        
        List<Integer> a = triangle.get(length-1);
        for (int i = length-2; i<-1; i--){
            for (int j=0; j< i+1; j++){
                int newValue = triangle.get(i).get(j) + Math.min(a.get(j),a.get(j+1));
                a.set(j, newValue );
            }
        }
        return a.get(0);
    }
    
    public static void main(String[] args){
    	List<List<Integer>> triangle = new ArrayList<>();
    	List<Integer> a = new ArrayList<>();
    	List<Integer> b = new ArrayList<>();
    	a.add(1);
    	b.add(2);
    	b.add(3);
    	triangle.add(a);
    	triangle.add(b);
    	
    	minimumTotal(triangle);
    }
}