public class temp{
    public static void main(String[] args){

//   	temp t = new temp();
    	int[] a = new int[9];
    	for(int i=0; i < 9; i++){
    		if (a[i]!=0){
    	System.out.println(a[i]);
    		}
    	char[][] board = {{'.','1'},{'8','9'}};
    	int num1 = (int)board[0][1] - 1;
    	System.out.println(num1);
    }
    }
}