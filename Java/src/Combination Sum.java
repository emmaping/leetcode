public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        for(int i = 0; i<candidates.length; i++){
            if (candidates[i] < target){
                 List<List<Integer>> subSet = combinationSum(Arrays.copyOfRange(candidates,i,candidates.length), target- candidates[i]);
                 
                 for(List<Integer> list : subSet){
                    list.add(0,candidates[i]);
                    ret.add(list);
                 }
            }
            else if (candidates[i] == target){
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(candidates[i]);
                ret.add(newList);
            }
            else{
                break;
            }
        }
        return ret;
    }
}