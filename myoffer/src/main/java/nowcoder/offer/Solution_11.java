package nowcoder.offer;

/**
 * @class: Solution_11
 * @description: 1 的个数
 * @author: yi-yun
 * @create: 2019-07-28 23:39
 **/
public class Solution_11 {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
