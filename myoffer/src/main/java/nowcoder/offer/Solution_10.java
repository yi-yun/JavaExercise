package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_10
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-28 23:31
 **/
public class Solution_10 {
    public int RectCover(int target) {
        if (target == 1 || target == 2) {
            return target;
        }
        int preOne = 2, preTwo = 1;
        int res = 0;
        for (int i = 2; i < target; i++) {
            res = preOne + preTwo;
            preTwo = preOne;
            preOne = res;
        }
        return res;
    }
    
    @Test
    public void fun(){
        int rectCover = RectCover(4);
    }
}
