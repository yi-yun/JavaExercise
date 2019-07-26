package leetcode.array;

/**
 * @class: LC_1122
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-26 22:44
 **/
public class LC_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int[] cnt = new int[1001];
        int[] res = new int[arr1.length];
        for (int i : arr1) {
            cnt[i]++;
        }
        for (int i : arr2) {
            while (cnt[i]-- > 0) {
                res[k++] = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i]-- > 0) {
                res[k++] = i;
            }
        }
        return res;
    }
}
