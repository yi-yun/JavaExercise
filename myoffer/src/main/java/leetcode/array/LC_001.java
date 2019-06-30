package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LC_001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (hashMap.containsKey(key) && hashMap.get(key) != i) {
                return new int[]{i, hashMap.get(key)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
