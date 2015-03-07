public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> prev = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        return helper(n, k, 1 ,prev, ret);
    
        
    }
    public List<List<Integer>> helper(int n, int k, int offset, List<Integer> prev,  List<List<Integer>> ret) {
        if (k == 0){
            ret.add(prev);
            return ret;
        } 
        
        for (int i = offset; i < n-k+2; i++){
            List<Integer> cur = new ArrayList<>(prev);
            cur.add(i);
            helper(n, k-1, i+1,cur, ret);
        }
        return ret;
    }
    
}