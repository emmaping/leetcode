public class Solution {
public int removeElement(int[] A, int elem) {
int length = A.length;
int count = 0;
for(int i = 0 ; i < length; i++){
if(A[i] == elem){
count++ ;
}
else{
A[i-count] = A[i];
}
}
return length-count;
}
}