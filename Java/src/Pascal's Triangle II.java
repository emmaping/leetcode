public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0){
            return list;
        }
        for (int i=0; i< rowIndex; i++){
            list.add(0);
            list.add(0,0);
            List<Integer> newList = new ArrayList<>();

            for (int j=0 ; j< list.size()-1 ; j++){
                newList.add(list.get(j) + list.get(j+1));
            }
            list = newList;
        }
        return list;
    }
}