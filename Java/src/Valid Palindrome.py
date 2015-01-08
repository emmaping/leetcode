public class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        if (length <= 1) {
            return true;
        }
        s = s.toLowerCase();
        StringBuilder forward = new StringBuilder();
        for (int i=0; i < length; i++){
            char ch = s.charAt(i);
            if ((ch<='z' && ch>='a') || (ch>='0' && ch<='9')){
                forward.append(ch);
            }
        }
        String s1 = forward.toString();
        String s2 = forward.reverse().toString();
        return s1.equals(s2);
    }
}