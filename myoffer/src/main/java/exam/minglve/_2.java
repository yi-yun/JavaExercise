package exam.minglve;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 15:48
 **/
public class _2 {
    private static char[] num = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
    private static char[] unt = {'万', '亿'};
    private static char[] dd = {'拾', '佰', '仟'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        cal(aDouble);
    }

    private static void cal(double aDouble) {
        if (aDouble == 0) {
            System.out.println("人民币零元整");
            return;
        }
        long v = (long) (aDouble * 100);
        String s = String.valueOf(v);
        String zheng = s.substring(0, s.length() - 2);
        String xiaoshu = s.substring(s.length() - 2);
        StringBuilder pre = new StringBuilder("人民币");
        StringBuilder sub = new StringBuilder();
        if ("00".equals(xiaoshu)) {
            sub.append("整");
        } else {
            sub.append(num[xiaoshu.charAt(0) - '0'] + "角" + num[xiaoshu.charAt(1) - '0'] + "分");
        }

        char[] head = zheng.toCharArray();
        int cnt = 0;
        char f = '0';
        for (int i = 0; i < head.length; i++) {
            int idx = (head.length - i - 1) % 4;
            int e = (head.length - i - 1) / 4;
            if (head[0] == '0') {
                cnt++;
                if (f == '0') {
                    f = head[0];
                } else if (idx == 0 && e > 0 && cnt < 4) {
                    pre.append(unt[e - 1]);
                    f = '0';
                }
                continue;
            }
            cnt = 0;

            if (f != '0') {
                pre.append(f);
                f = '0';
            }
            pre.append(num[head[i] - '0']);
            if (idx > 0) {
                pre.append(dd[idx - 1]);
            }
            if (idx == 0 && e > 0) {
                pre.append(unt[e - 1]);
            }
        }
        pre.append("元");
        System.out.println(pre.append(sub).toString());

    }

    @Test
    public void fun() {
        // 人民币拾伍万壹仟壹佰贰拾壹元壹角伍分

        cal(151121.15);
    }
}
