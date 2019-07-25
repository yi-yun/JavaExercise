package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_9
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-25 22:58
 **/
public class Solution_9 {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

   
    @Test
    public void fun() {
        int i = JumpFloorII(7);
    }
}
