public class Solution {
    public boolean isMatch(String s, String p) {
        boolean matrix[][] = new boolean[s.length()+1][p.length()+1];
        matrix[0][0] = true;
        boolean valid = false;
        for(int j = 2;j <= p.length();j+=2){
            if(p.charAt(j-1)=='*'){ valid = true; matrix[0][j] = true;}
            else{ break;}
        }
        for(int i = 1;i <= s.length();i++){
            for(int j = 1;j <= p.length();j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.') matrix[i][j] = matrix[i-1][j-1];
                else if(p.charAt(j-1)=='*'){
                    if(s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)=='.')
                        matrix[i][j] = matrix[i-1][j] || matrix[i][j-2];
                    else
                        matrix[i][j] = matrix[i][j-2];
                }
            }
        }
        return matrix[s.length()][p.length()];
    }
}