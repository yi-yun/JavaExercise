package leetcode.array;

public class LC_905 {
    public int[] sortArrayByParity(int[] A) {
        int z=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]%2==0){
                int temp=A[z];
                A[z]=A[i];
                A[i]=temp;
                z++;
            }
        }
        return A;
    }
}
