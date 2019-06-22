package leetcode.binarysearch;

import org.junit.Test;

public class LC_852 {
    public int peakIndexInMountainArray(int[] A) {
        int length = A.length;
        int left=0;
        int right=length-1;
        while (left<=right){
            int mid = ((right - left) >> 1) + left;
            if(A[mid - 1] < A[mid] && A[mid] < A[mid + 1])
                left = mid + 1;
            else if(A[mid - 1] > A[mid] && A[mid] > A[mid + 1])
                right = mid - 1;
            else if(A[mid - 1] < A[mid] && A[mid] > A[mid + 1])
                return mid;
        }
        return -1;
    }
    @Test
    public void fun(){
        int[] arrays = {0, 1, 2, 3, 1, 0};
        int index = peakIndexInMountainArray(arrays);
        System.out.println("index = " + index);
    }
}
