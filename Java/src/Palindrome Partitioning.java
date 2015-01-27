public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        if (s==null || s.length() == 0) return list;
        return partition(s, 0, s.length());
    }

    public List<List<String>> partition(String s, int start, int end) {
        List<List<String>> list = new ArrayList<>();

        if (isPalidrome(s,start,end)){
            List<String> l = new ArrayList<>();
            l.add(s.substring(start, end));
            list.add(l);
        }

        if (end-start == 1) return list;

        for (int i = start+1; i<end; i++){
            if (isPalidrome(s,start,i)){
                List<List<String>> newList = partition(s, i, end);
                for(List<String> j : newList){
                    j.add(0,s.substring(start,i));
                }
                list.addAll(newList);
            }
        }
        return list;
    }

    private boolean isPalidrome(String s, int start, int end) {
        for (int i=start, j=end-1; j>i; j--,i++) {
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }

        return true;
    }
}