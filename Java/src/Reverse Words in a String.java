public class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String ret = "";
        if (parts.length > 0) {
            for (int i = parts.length - 1; i > 0; i--) {
                ret += parts[i] + " ";
            }
            ret += parts[0];
        }
        return ret;
        
    }
}