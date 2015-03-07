public class Solution {
    public int[] searchRange(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        int[] result = {-1, -1};
        while(left<right){
            int mid = (left + right) / 2;
            if(A[mid] < target) left = mid+1;
            else right = mid;
        }

        if (A[left] == target){
            result[0]= left;
            result[1]= left;
            while ((left+1 <= A.length-1) && A[left+1] == target) left++;
            result[1] = left;
        }
        return result;
    }
}