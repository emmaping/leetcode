public class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int ret = 0;
        for (int i = length-1; i>=0 ; i--){
            if (ret == 0 && s.charAt(i) != ' '){
                ret = 1;
            }
            else if (ret != 0 && s.charAt(i) != ' '){
                ret++;
            }
            else if (ret != 0 && s.charAt(i) == ' '){
                return ret;
            }
        }
        return ret;
        
    }
}