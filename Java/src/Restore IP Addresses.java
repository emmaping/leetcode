public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();
        int length = s.length();
        for (int i = 1; i<=3 ; i++){
            for (int j= i+1; j<=i+3; j++){
                for (int k = j+1; k<=j+3; k++){
                    if (k>=length) continue;
                    String s1 = s.substring(0,i);
                    String s2 = s.substring(i,j);
                    String s3 = s.substring(j,k);
                    String s4 = s.substring(k,length);
                    if(validIp(s1) && validIp(s2) && validIp(s3) && validIp(s4)){
                        ret.add(s1 + "." + s2 + "." +s3 + "." +s4 );
                    }
                }
            }
        }
        return ret;
        
    }
    
    public boolean validIp(String s){
        if(s.length() > 1 && s.charAt(0) == '0') return false;
        if (s.length() > 3 || Integer.parseInt(s) > 255) return false;
        return true;
        
    }
}