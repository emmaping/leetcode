public class Solution {
    public int atoi(String str) {
        boolean sign = false;
        int isNeg = 1;
        double ret = 0;
        str = str.trim();

        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if ((c == '-' || c == '+') && !sign ) { 
                sign = true;
                if (c== '-'){
                    isNeg = -1;
                }
            }
            else if (c >= '0' && c <='9'){
                ret = ret * 10 + Character.getNumericValue(c);
            }
            else{
                break;
            }
        }
        int intRet = (int)(ret*isNeg);
        if (intRet > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (intRet < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return intRet;
    }
}