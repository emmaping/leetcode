public class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int row = board.length;
        int col = board[0].length;
        
        if (col < 3 || row < 3) return;
        for (int j=0; j < col; j++){
            if (board[0][j] == 'O') helper(0,j,board);
            if (board[row-1][j] == 'O') helper(row-1,j,board);
        }
        
        for (int i=1; i < row-1; i++){
            if (board[i][0] == 'O') helper(i,0,board);
            if (board[i][col-1] == 'O') helper(i,col-1,board);
        }
        
        for (int i=0 ; i< row; i++){
            for(int j=0; j<col; j++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'M') board[i][j] = 'O';
            }
        }
        
        
    }
    public void helper(int i, int j, char[][] board){
           int row = board.length; 
           int col = board[0].length;
            Stack<int[]> s = new Stack<>(); 
            s.add(new int[] {i,j});
            while(!s.isEmpty()) { 
                int[] p = s.pop();
                int m = p[0];
                int n = p[1];
                board[m][n] = 'M';
                if ( m > 0 && board[m-1][n] == 'O'){
                    s.push(new int[]{m-1,n});}
                    
                if (m < row-1 && board[m+1][n] == 'O'){
                    s.push(new int[]{m+1,n});}
                if (n > 0 && board[m][n-1] == 'O'){
                    s.push(new int[]{m,n-1});}
                if (n < col - 1 && board[m][n+1] == 'O'){
                    s.push(new int[]{m, n+1});}
            }
    }
}