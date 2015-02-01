
        		
public class Solution {
    public int trailingZeroes(int n) {
        int ret = 0;
        while (n != 0){
            n = n/5;
            ret = ret + n;
        }
        return ret;
    }
}