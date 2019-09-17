package exam.zhuanzhuan;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-16 21:28
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        String[] split = s.split(",");
        int length = split.length;
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }
        System.out.println(sum);
    }
}
