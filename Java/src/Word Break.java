
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        int length = s.length();
        boolean[] d = new boolean[length+1];
        Arrays.fill(d, false);
        d[0] = true;
        
        for(int i = 0; i<= length; i++){
            for(String w:dict){
                if((i - w.length() >= 0) && d[i-w.length()]){
                        if(s.substring(i-w.length(), i).equals(w)){
                            d[i] = true;
                            break;
                       }
                }
            }
        }
     return d[length];
    }
}