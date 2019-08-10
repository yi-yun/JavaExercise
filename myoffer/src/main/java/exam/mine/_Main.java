package exam.mine;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _MAin
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-10 11:03
 **/
public class _Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double sum = n, temp = n;
            int m = scanner.nextInt();
            for (int i = 1; i < m; i++) {
                temp = Math.sqrt(temp);
                sum += temp;
            }
            DecimalFormat format = new DecimalFormat("0.00");
            System.out.println(format.format(sum));
        }

    }
}
