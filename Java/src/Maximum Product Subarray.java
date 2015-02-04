public class Solution {
    public int maxProduct(int[] A) {
        int length = A.length;
        if(length == 0) return 0;
        
        int maxProduct = A[0];
        int minProduct = A[0];
        int ret = A[0];
        
        for(int i=1; i<length; i++ ){
            int tmp = maxProduct;
            maxProduct = Math.max(Math.max(maxProduct * A[i], minProduct*A[i]), A[i]);
            minProduct = Math.min(Math.min(tmp * A[i], minProduct*A[i]), A[i]);
            ret = Math.max(ret, maxProduct);
        }
        return ret;
    }
}