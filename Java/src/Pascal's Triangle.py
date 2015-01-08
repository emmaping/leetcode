public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows == 0){
            return ret;
        }
        ret.add(cur);
        if (numRows == 1){
            return ret;
        }
        for (int i=0; i<numRows-1; i++){
            List<Integer> last = new ArrayList<>(cur);
            last.add(0);
            last.add(0,0);
            List<Integer> newList = new ArrayList<>();

            for (int j=0; j<last.size()-1; j++){
                newList.add(last.get(j) + last.get(j+1));
            }
            cur = newList;
            ret.add(newList);
        }
        return ret;
    }
}