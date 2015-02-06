public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int ret = 0;
                int last = Integer.parseInt(stack.pop());
                int sec = Integer.parseInt(stack.pop());
                if (s.equals("*")){
                    ret = sec * last;
                }
                if (s.equals("/")){
                    ret = sec / last;
                }
                if (s.equals("+")){
                    ret = sec + last;
                }
                if (s.equals("-")){
                    ret = sec - last;
                }
                stack.push(Integer.toString(ret));
            }
            else{
                stack.push(s);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
}