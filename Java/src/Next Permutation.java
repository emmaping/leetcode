public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length == 1 || num.length == 0) return;
        int index = num.length - 2;
        for(index = num.length-2;index >= 0;index--){
            if(num[index+1] > num[index]){
                break;
            }
        }
        if (index >= 0) {
            for (int i = num.length - 1; i > index; i--){
                if(num[index] < num[i]){
                    int temp = num[index];
                    num[index] = num[i];
                    num[i] = temp;
                    break;
                }
            }
        }
        
        for(int i = index+1, j = num.length - 1; i<j; i++, j--){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }
}