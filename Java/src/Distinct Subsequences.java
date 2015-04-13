public class Solution {
    public int numDistinct(String S, String T) {
        if (S.length() < T.length()) return 0;

        int[][] dp = new int[S.length()+1][T.length()+1];

        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                if (i== 0 && j==0) {
                    dp[i][j] = 1;
                }
                else if (i==0) {
                    dp[i][j] = 0;
                }
                else if (j==0) {
                     dp[i][j] = 1;
                }
                else if (i < j){
                    dp[i][j] = 0;
                }
                else{
                    if (S.charAt(i-1) == T.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                    }
                    else{
                         dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }    
        return dp[S.length()][T.length()];
    }
}