package nowcoder.offer;

/**
 * @class: Solution_8
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-14 19:50
 **/
public class Solution_8 {
    public int JumpFloor(int target) {
        int res = 1, preTwo = 1, preOne = 2;
        if (target == 1 || target == 2) {
            return target;
        }
        for (int i = 2; i < target; i++) {
            res = preOne + preTwo;
            preTwo = preOne;
            preOne = res;
        }
        return res;
    }
}
