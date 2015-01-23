public class Solution {
    public boolean isValid(String s) {
        char[] cString = s.toCharArray();
        Map<Character, Character> bracksets = new HashMap<>();
        bracksets.put('(', ')');
        bracksets.put('{', '}');
        bracksets.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        for (char c : cString){
            if (bracksets.containsKey(c)){
                stack.push(bracksets.get(c));
            }
            else if(stack.isEmpty() || c!= stack.pop() ){
               return false;
            }
        }
        return stack.isEmpty();
    }
}