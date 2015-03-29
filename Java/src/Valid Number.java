public class Solution {
    public boolean isNumber(String s) {
	    s = s.trim();
	
	    boolean hasPoint = false;
	    boolean hasE = false;
	    boolean hasNumber = false;
	    boolean hasNumderAfterE = true;
	    for(int i=0; i<s.length(); i++) {
	        if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
	            hasNumber = true;
	            hasNumderAfterE = true;
	        } else if(s.charAt(i) == '.') {
	            if(hasE || hasPoint) {
	                return false;
	            }
	            hasPoint = true;
	        } else if(s.charAt(i) == 'e') {
	            if(hasE || !hasNumber) {
	                return false;
	            }
	            hasNumderAfterE = false;
	            hasE = true;
	        } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
	            if(i != 0 && s.charAt(i-1) != 'e') {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
	
	    return hasNumber && hasNumderAfterE;

    }
}