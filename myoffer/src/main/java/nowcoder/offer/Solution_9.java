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

    public int JumpFloorII2(int target) {
        return fun2expr(target - 1);
    }

    private int fun2expr(int source) {
        if (source == 0) {
            return 1;
        }
        if (source == 1) {
            return 2;
        }
        int sum = 1;
        if (source % 2 == 0) {
            int temp = fun2expr(source / 2);
            sum = sum * temp * temp;
        } else {
            int temp = fun2expr((source + 1) / 2);
            sum = sum * temp * temp / 2;
        }
        return sum;
    }


    @Test
    public void fun() {
        int i = JumpFloorII(7);
    }
    
    @Test
    public void fun2(){
        int i = JumpFloorII2(7);
    }
}
