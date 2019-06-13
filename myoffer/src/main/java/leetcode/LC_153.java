package leetcode;

import org.junit.Test;

public class LC_153 {
    public int findMin(int[] nums) {
        if (nums==null || nums.length==0) { return Integer.MIN_VALUE; }
        int left = 0, right = nums.length-1;
        while (left < right-1) {  // while (left < right-1) is a useful technique
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[right]) { left = mid; }
            else { right = mid; }
        }
        if (nums[left] > nums[right]) { return nums[right]; }
        return nums[left];
    }
    @Test
    public void fun(){
        int[] a = {9, 10,11, 1, 2, 3, 4,5,6,7,8};
        int min = findMin(a);
        System.out.println("min = " + min);
    }
    
}
