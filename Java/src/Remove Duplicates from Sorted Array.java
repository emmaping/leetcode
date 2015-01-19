public class Solution {
    public int removeDuplicates(int[] A) {
        int length = A.length;
        if (length < 2) {
            return length;
        }

        int count = 0;
        for (int i = 1; i < length; i++ ){
            if (A[i] == A[i-1]){
                count++;
            }
            else {
                A[i-count] = A[i];
            }
        }
        return length - count;
    }
}

