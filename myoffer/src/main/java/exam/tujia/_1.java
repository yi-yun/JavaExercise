package exam.tujia;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: 法师的跑步的速度为13m/s,以这样的速度，是无法逃离雪崩的。
 * 但是，法师有闪跳技能，可在1s内移动50m,每次使用技能后，会消耗10点魔法值。
 * 魔法值的恢复速度为4点/s,只有在原地休息状态时才能够恢复。
 * 现已知法师初始值为M,所在位置与安全区域的距离为S,雪崩到达村庄的时间为T。
 * 编写一个程序，计算法师如何在最短的时间内到达安全区域，如不能够逃脱，输出法师在时间内走的最远距离。
 * @author: yi-yun
 * @create: 2019-09-06 19:49
 **/
public class _1 {
    // 已知法师初始值为M,所在位置与安全区域的距离为S,雪崩到达村庄的时间为T。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        cal(m, s, t);
    }

    private static void cal(int m, int s, int t) {
        int f = m;
        int dp = 0;
        for (int i = 0; i < t; i++) {
            if (f >= 10) {
                dp = dp + 50;
                f = f - 10;
            } else {
                dp = dp + 13;
                f = f + 4;
            }
            if (dp >= s) {
                System.out.println("Yes");
                System.out.println(i + 2);
                return;
            }
        }
        System.out.println("No");
        System.out.println(dp);
    }

    @Test
    public void fun() {
        cal(36, 255, 10);
    }
}
