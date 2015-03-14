import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
      List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(num);
        for(int i = 0; i<num.length; i++){
            if (num[i] < target){
                 List<List<Integer>> subSet = combinationSum2(Arrays.copyOfRange(num,i+1,num.length), target- num[i]);
                 
                 for(List<Integer> list : subSet){
                    list.add(0,num[i]);
                    if (!ret.contains(list)){
                         ret.add(list);
                    }
                   
                 }
            }
            else if (num[i] == target){
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(num[i]);
                if (!ret.contains(newList)){
                        ret.add(newList);
                    }
                
            }
            else{
                break;
            }
        }
        return ret;
    }
}