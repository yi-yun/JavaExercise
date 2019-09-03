package exam.vipkid;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-03 16:46
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        int cnt = 0;
        while (i != 0) {
            i = i & (i - 1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
