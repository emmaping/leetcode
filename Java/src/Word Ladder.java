import java.util.List;
import java.util.LinkedList;
public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        if (start.length() ==0 || end.length() == 0 || dict.size() == 0) return 0;
        if (start.equals(end)) return 1;
        
        LinkedList<String> queue = new LinkedList<>();
        LinkedList<Integer> depth = new LinkedList<>();
                
        queue.add(start);
        depth.add(1);
        
        Set<String> dist = new HashSet<>();
        dist.add(start);
        
        while (queue.size() !=0 ){
            String cur = queue.removeLast();
            int count = depth.removeLast();
            
            for(int i=0; i<cur.length(); i++){
                char[] wordChar = cur.toCharArray();
                for (char c ='a'; c<= 'z'; c++){
                    charArray[i] = c;
                    wordString = new String(charArray);
                    if (wordString.equals(end)){
                        return count+1;
                    }
                    else if(dict.contains(wordString) && !dist.contains(wordString)){
                        queue.add(wordString);
                        depth.add(count + 1);
                        dist.add(wordString);
                    }
                }
            }
        }
        return 0;
    }
}