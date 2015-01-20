public class Solution {
    public boolean isValidSudoku(char[][] board){
        for (int i = 0 ; i<9; i++){
            int[] a = new int[9];
            int[] b = new int[9];
            int[] c = new int[9];
            for (int j= 0 ; j<9 ; j++){
                if (board[i][j] != '.'){
                    int num1 =  Character.getNumericValue(board[i][j]) - 1;
                    if (a[num1] != 0){
                        return false;
                    }
                    else{
                        a[num1] = 1;
                    }
                }
                
                if (board[j][i] != '.'){
                    int num2 =  Character.getNumericValue(board[j][i]) - 1;
                    if (b[num2] != 0){
                        return false;
                    }
                    else{
                        b[num2] = 1;
                    }
                }
                
                if (board[i/3*3 + j/3][i%3*3 + j%3] != '.'){
                    int num3 =  Character.getNumericValue(board[i/3*3 + j/3][i%3*3 + j%3]) - 1;
                    if (c[num3] != 0){
                        return false;
                    }
                    else{
                        c[num3] = 1;
                    }
                }

            }
        }
        return true;
    }
}