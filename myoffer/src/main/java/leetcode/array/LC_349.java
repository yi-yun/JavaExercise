package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;

public class LC_349 {
    /**
     * @param nums1
     * @param nums2
     * @return int[]
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : nums1) {
            hashSet.add(a);
        }
        for (int n : nums2) {
            if (hashSet.remove(n)) {
                list.add(n);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
