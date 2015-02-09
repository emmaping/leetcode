public class Solution {
    public int numTrees(int n) {
        int[] Num = new int[n+1];
        Num[1] = Num[0] = 1;
        
        for (int i = 2; i <= n; i++ ){
            for (int j = 0; j<i; j++){
                Num[i]+= Num[j] * Num[i-1-j];
            }
        }
        return Num[n];
    }
}