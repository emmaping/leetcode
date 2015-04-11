public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ret = 0;
        if (matrix==null||matrix.length==0||matrix[0].length==0)  return ret;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == '1'){
                    height[j] = height[j]+1;
                }
                else{
                    height[j] = 0;
                }
            }
            ret = Math.max(ret, largestRectangleArea(height));
        }
        return ret;
    }
    
    public int largestRectangleArea(int[] height) {
        int length = height.length;
        Stack<Integer> stack = new Stack<>();
        int ret = 0;
        int hi;
        int s; 

        for (int i = 0; i <= length; i++){
           if (i == length){
                hi = 0;
            }
            else{
                hi = height[i];
            }
            while (!stack.isEmpty() && height[stack.peek()] >= hi) {
                int h = height[stack.pop()];
                if (!stack.isEmpty()){
                    s = stack.peek();
                }
                else{
                    s = -1;
                }
                ret = Math.max(ret, h*(i-s-1));
            }
            stack.push(i);
        }
        return ret;
    }
}