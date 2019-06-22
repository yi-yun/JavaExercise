package leetcode.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LC_977 {
    //java 8 Stream
    public int[] sortedSquares(int[] A) {
        IntStream stream = Arrays.stream(A);
        int[] ints = stream.map((o) -> o * o).sorted().toArray();
        return ints;
    }

    //my thought
    public int[] sortedSquares1(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        Arrays.sort(B);
        return B;
    }

    //slow and fast
    public int[] sortedSquares2(int[] A) {
        int fast = A.length - 1;
        int slow = 0;
        int[] res = new int[A.length];
        int p = A.length-1;
        while (slow<=fast){
            int L=A[slow]*A[slow];
            int R=A[fast]*A[fast];
            if (L<R){
                res[p--]=R;
                fast--;
            }else {
                res[p--]=L;
                slow++;
            }
        }
        return res;
    }

    @Test
    public void fun() {
        int[] ints = {-4, -1, 0, 3, 10};
        int[] sortedSquares = sortedSquares2(ints);
        for (int i = 0; i < sortedSquares.length; i++) {
            System.out.println("i = " + sortedSquares[i]);
        }
    }
}
