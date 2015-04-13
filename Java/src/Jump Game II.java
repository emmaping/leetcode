public class Solution {
    public int jump(int[] A) {
        if (A.length <= 1) return 0;
        int maxReach = A[0];
        int edge = 0;
        int ret = 0;
        
        for(int i = 0 ; i < A.length; i++){
            if (i > edge){
                ret++;
                edge = maxReach;
                if (edge > A.length - 1) return ret;
            }
            maxReach = Math.max(maxReach, A[i] + i);
            if (maxReach < i) return -1;
        }
        return ret;
    }
}
