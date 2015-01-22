public class Solution {
    public int reverse(int x) {
        int isNeg = 1;
        if (x<0){
            isNeg = -1;
            x = -x;
        }
        int ret = 0;
        while (x>0){
            if (Integer.MAX_VALUE / 10 < ret || (Integer.MAX_VALUE - x % 10) < ret * 10) {
                return 0;
            }
            ret = ret * 10 + x%10;
            x = x/10;
        }

        return ret*isNeg;
    }
}