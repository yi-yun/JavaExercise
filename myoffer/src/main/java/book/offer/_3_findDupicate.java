package book.offer;

import org.junit.Test;

public class _3_findDupicate {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow) {
                fast = 0;
                while (nums[fast] != nums[slow]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }

    public int findDuplicate2(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = ((end - start) >> 1) + start;
            int cntRange = cntRange(nums, start, mid);
            if (start == end) {
                if (cntRange > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (cntRange > mid - start + 1) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int cntRange(int[] nums, int start, int end) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= start && nums[i] <= end) {
                cnt++;
            }
        }
        return cnt;
    }

    @Test
    public void fun() {
        int[] ints = {3, 1, 4, 3, 2};
//        int duplicate = findDuplicate(ints);
        int duplicate = findDuplicate2(ints);
        System.out.println("duplicate = " + duplicate);
    }
}
