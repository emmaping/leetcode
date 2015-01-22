public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur = 0;
        int lack = 0;
        int index = 0;
        for (int i=0 ; i < gas.length ; i++){
            cur = cur + gas[i] - cost[i];
            if (cur < 0){
                lack = lack + cur;
                cur = 0;
                index = i + 1;
            }
        }
        if (lack + cur >= 0){
            return index;
        }
        else{
            return -1;
        }
    }
}